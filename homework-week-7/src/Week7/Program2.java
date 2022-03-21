package Week7;
/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;//import of Scanner class

public class Program2 {

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Defining a Scanner method
        System.out.println("Please enter a year : ");//input wizard for a user
        int b = sc.nextInt();
        System.out.println(isLeapYear(b));
    }

    // Defining a method to check Leap Year
    public static String isLeapYear(int a) {
        String year;
        if (a % 4 == 0 && a % 100 != 0) {
            year = "is leap year";
        } else if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
            year = "is leap year";
        } else
            year = "is not a leap year";
        return year;
    }
}



