package Week7;
/*
Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
import java.util.Scanner;//Importing a Scanner class

public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number [1 to 7] :");//input wizard for a user
        int daynumber = scan.nextInt();
        System.out.println("Day is : " + returnDayName(daynumber)); // Calling a static method
    }

    //Defining a static method
    public static String returnDayName(int a) {
        String dayname = "";
        switch (a) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Monday";
                break;
            case 4:
                dayname = "Tuesday";
                break;
            case 5:
                dayname = "Monday";
                break;
            case 6:
                dayname = "Tuesday";
                break;
            case 7:
                dayname = "Monday";
                break;
            default:
                dayname = "!! Invalid input, Week contains 1 to 7 days.";
                break;
        }
        return dayname;

    }
}

