package Week7;
/*
Write a java program to prepare a mark sheet of a student of using a given detail of marks, roll nr. and name
 */
import java.util.Scanner;//import of Scanner class

public class Program3 {
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Defining a Scanner method

        System.out.println("Enter the name of the Student : "); //input wizard for a user
        String name = sc.nextLine();

        System.out.println("Enter the roll number of the student : ");//input wizard for a user
        int rollnr = sc.nextInt();

        System.out.println("Enter the marks of Math : ");//input wizard for a user
        int mathmark = sc.nextInt();

        System.out.println("Enter the marks of Science : ");//input wizard for a user
        int scimark = sc.nextInt();

        System.out.println("Enter the marks of English : ");//input wizard for a user
        int engmark = sc.nextInt();

        if (mathmark < 0 || mathmark > 100) {
            System.out.println("Invalid Input of Math's mark, Marks should between 0 to 100");
        } else if (scimark < 0 || scimark > 100) {
            System.out.println("Invalid Input of Science's mark, Marks should between 0 to 100");
        } else if (engmark < 0 || engmark > 100) {
            System.out.println("Invalid Input English's mar, Marks should between 0 to 100");
        } else {
            int total = mathmark + scimark + engmark;
            int percetage = ((total) * 100) / 300;

            System.out.println("|-------------------------------|");
            System.out.println("|          MARK SHEET           |");
            System.out.println("|-------------------------------|");
            System.out.println("|  Name        :     " + name + "\t|");
            System.out.println("|  Roll No     :         " + rollnr + "\t\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|  Subject     :   Marks        |");
            System.out.println("|-------------------------------|");
            System.out.println("|  Math        :     " + mathmark + "\t\t\t|");
            System.out.println("|  Science     :     " + scimark + "\t\t\t|");
            System.out.println("|  English     :     " + engmark + "\t\t\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|  TOTAL       :  " + total + "\t\t\t|");
            System.out.println("|-------------------------------|");
            System.out.println("|  Percentage  :  " + percetage + " %\t\t\t|");
            System.out.println("|  Result      :  " + passFail(percetage) + "\t\t\t|");
            System.out.println("|  Grade       :  " + gradecheck(percetage) + "\t\t\t\t|");
            System.out.println("|-------------------------------|");
        }


    }

    // defining a static method
    public static String gradecheck(int a) {
        String grade;
        if (a >= 80) {
            grade = "A+";
        } else if (a >= 60 && a < 80) {
            grade = "A";
        } else if (a >= 50 && a < 60) {
            grade = "B";
        } else if (a >= 35 && a < 50) {
            grade = "C";
        } else {
            grade = "FAIL";
        }
        return grade;
    }

    // defining a static method
    public static String passFail(int a) {
        String cre;
        if (a >= 35) {
            cre = "PASS";
        } else {
            cre = "FAIL";
        }
        return cre;
    }
}



