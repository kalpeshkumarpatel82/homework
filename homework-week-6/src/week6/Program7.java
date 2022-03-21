package week6;
/*
Objective of this program
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program7 {
    //Main method
    public static void main(String[] args) {
        float cel;

        Scanner input = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Enter a value in °F : "); // Input wizard for a user
        float feh = input.nextInt();

        cel = ((feh - 32) * 5) / 9; //Formula to convert fahrenheit  to celsius
        System.out.println(feh + " °F is : " + cel + " °C");

    }
}
