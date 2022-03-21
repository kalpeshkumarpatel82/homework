package week6;
/*
Objective of this program
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program16 {
    //Main method
    public static void main(String[] args) {
        //int decimal3;
        Scanner input = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Input first binary number: "); // Input wizard for user to first binary number
        String txt1 = input.nextLine();
        int decimal1 = Integer.parseInt(txt1, 2); // Converting Binary to decimal

        System.out.print("Input second binary number: "); // Input wizard for user to second binary number
        String txt2 = input.nextLine();
        int decimal2 = Integer.parseInt(txt2, 2); // Converting Binary to decimal

        //for info only, converted Binary printed on console in Decimal format
        System.out.println("First given Binary in Decimal is : " + decimal1);
        System.out.println("Second given Binary in Decimal is : " + decimal2);

        //Adding to converted decimal
        int decimal3 = decimal1 + decimal2;

        // Converting Binary to decimal and printing on console
        System.out.println("Sum of two given binaries is (in Binary) :" + Integer.toBinaryString(decimal3) + " or (in Decimal) : " + decimal3);
        //System.out.println("Sum of two given binaries is (in Decimal) :" + decimal3);


    }
}
