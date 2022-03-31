package week7revision;

import java.util.Scanner;

/*
Write a Java program which input any number between 1 to 7 and
it prints The Days name MONDAY, TUESDAY ..., SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/
public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 :");
        int day = scanner.nextInt();
        findTheDaysName(day);
        //Closing the scanner object
        scanner.close();

    }

    //Finding the name of the Day
    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("It's a Monday!");
                break;
            case 2:
                System.out.println("It's a Tuesday!");
                break;
            case 3:
                System.out.println("It's a Wednesday!");
                break;
            case 4:
                System.out.println("It's a Thursday!");
                break;
            case 5:
                System.out.println("It's a Friday!");
                break;
            case 6:
                System.out.println("It's a Saturday!");
                break;
            case 7:
                System.out.println("It's a Sunday!");
                break;
            default:
                System.out.println("!!! Week contains 1 to 7 days.");

        }
    }
}
