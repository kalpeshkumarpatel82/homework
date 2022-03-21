package week6;
/*
Objective of this program
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program17 {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating a new Scanner object
        System.out.print("Input a decimal number: "); //Input wizard for decimal
        int txt11 = input.nextInt();
        String decimal11 = Integer.toBinaryString(txt11); //convert decimal to binary
        System.out.println("Binary number is : " + decimal11); // output to console

    }
}
