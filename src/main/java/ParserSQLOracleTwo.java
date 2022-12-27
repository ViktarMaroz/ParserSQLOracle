import java.util.Scanner;

public class ParserSQLOracleTwo {
    public static void main(String[] args){
        Scanner parser = new Scanner(System.in);
        System.out.println("Hello! Enter your copy of unquoted data:");

        String parsed = parser.next();
        while (parser.hasNext()){
        System.out.println();
        String a1 = "'" + parsed + "', " +"'(NULL)', '(NULL)', ";
        parsed = parser.next();
        String a2 = "'" + parsed + "', ";
        parsed = parser.next();
        String a3 = "'" + parsed + "', ";
        parsed = parser.next();
        String a4 = "'" + parsed + "', ";
        parsed = parser.next();
        String a5 = "'" + parsed + "', ";
        parsed = parser.next();
        String a6 = "'" + parsed + "', ";
        parsed = parser.next();
        String a7 = "'" + parsed + "', ";
        parsed = parser.next();
        String a8 = "'" + parsed + "', ";
        parsed = parser.next();
        String a9 = "'" + parsed + " ";
        parsed = parser.next();
        String a10 = parsed + "', ";
        parsed = parser.next();
        String a11 = "'" + parsed + "', ";
        parsed = parser.next();
        String a12 = "'" + parsed + "', ";
        parsed = parser.next();
        String a13 = "'" + parsed + "', ";
        parsed = parser.next();
        String a14 = "'" + parsed + "'";


        System.out.print(a1+a2+a3+a4+a5+a6+a7+a8+a9+a10+a11+a12+a13+a14);}


//data example: 7641117a-cbe9-464f-920a-db896c9279d8	1	ddd1e5d7-093b-4a6b-b981-00ebb5ee59aa	92472f78-2735-48af-8859-0048a30a934c	01-NOV-22	02-NOV-22	XLSX	02f95491-3993-4430-90f7-0fb57530723f	28-NOV-22 10.38.38.736000000	TC011-B-USD	BCB-248_Direct_Participants_Table-A	TESTUSR1	0

    }
}
