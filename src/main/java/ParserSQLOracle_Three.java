import java.util.Scanner;

public class ParserSQLOracle_Three {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initial = null;
        String quoted = null;
        do {
            initial = scanner.nextLine();
            String[] words = initial.split(" ");
            for (int i = 0; i < words.length - 1; i++) {
                words[i] = "'" + words[i] + "'";
            }
            quoted = String.join(", ", words);
            System.out.println(quoted);
        } while (!initial.equals("0"));
    }

//data example: 7641117a-cbe9-464f-920a-db896c9279d8	1	ddd1e5d7-093b-4a6b-b981-00ebb5ee59aa	92472f78-2735-48af-8859-0048a30a934c	01-NOV-22	02-NOV-22	XLSX	02f95491-3993-4430-90f7-0fb57530723f	28-NOV-22 10.38.38.736000000	TC011-B-USD	BCB-248_Direct_Participants_Table-A	TESTUSR1	0

}
