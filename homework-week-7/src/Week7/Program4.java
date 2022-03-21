package Week7;
/*
To check if the given input of the year is leap or not, and according to finding program output the nr. of days
 */
import java.util.Scanner;//import of Scanner class

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Defining a Scanner method
        System.out.println("Please enter a year : ");//input wizard for a user
        int b = sc.nextInt();
        System.out.println("Please enter a month : ");//input wizard for a user
        int c = sc.nextInt();
        System.out.println("\n"+b+ " "+ isLeapYear(b));
        System.out.println("Month "+c+" of the year " +b +" has "+getDaysInMonth(c, b)+" days");
    }

    // defining a static method
    public static String isLeapYear(int a) {
        String year;
        if (a > 0 && a < 10000) { //if year is equal 1 to 9999
            if (a % 4 == 0 && a % 100 != 0) {
                year = "is leap year";
            } else if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
                year = "is leap year";
            } else
                year = "is not a leap year";
        } else // if year is not equal 1 to 9999
            year = "is not a valid entry : return -1";
        return year;
    }

    // defining a static method
    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;

        switch (month) {
            case 1: //Jan
            case 3: //Mar
            case 5: //May
            case 7: //July
            case 8://Aug
            case 10://Oct
            case 12://Dec
                daysInMonth = 31;
                break;
            case 4://Apr
            case 6://Jun
            case 9://Sept
            case 11://Nov
                daysInMonth = 30;
                break;
            case 2://Feb
                if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) { //check if year is leap year
                    daysInMonth = 29;
                } else { //if year is not leap year
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month: return -1");
                break;
        }

        return daysInMonth;
    }
}
