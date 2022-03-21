package week6;
/*
Objective of this program
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program18 {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Input first number: ");  //input wizard for a user
        int num18 = input.nextInt();

        System.out.print("Input second number: "); //input wizard for a user
        int num19 = input.nextInt();

        System.out.println(num18 + " + " + num19 + " = " + (num18 + num19)); // addition
        System.out.println(num18 + " - " + num19 + " = " + (num18 - num19)); // subtraction
        System.out.println(num18 + " x " + num19 + " = " + (num18 * num19)); // multiplication
        System.out.println(num18 + " / " + num19 + " = " + (num18 / num19)); // division
        System.out.println(num18 + " mod " + num19 + " = " + (num18 % num19)); //modulo
    }
}
