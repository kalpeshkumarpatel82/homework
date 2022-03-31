package week7revision;

import java.util.Scanner;

/*
Write a java program to input any year like (ex.2007) and find out if it is leap year on not ?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();
        Programme_2_LeapYear programme_2_leapYear = new Programme_2_LeapYear();
        programme_2_leapYear.isItLeapYear(year);
        scanner.close();
    }

    //Checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
