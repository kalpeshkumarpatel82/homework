package week6;
/*
Objective of this program
Write a Java program to swap two variables.
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program15 {
    // main method
    public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Input first number [A]: "); // Input wizard for user to enter the first binary number
        int a15 = input2.nextInt();

        System.out.print("Input Second number [B]: "); // input wizard for user to enter the second binary number
        int b15 = input2.nextInt();

        System.out.println("Before swapping : [A] = " + a15 + ", [B] = " + +b15); //info on console
        int temp15 = a15; // value of a15 is assigned to temp15
        a15 = b15; // value of b15 is assigned to a15
        b15 = temp15; // value of temp15 is assigned to b15
        System.out.println("After swapping : [A] = " + a15 + ", [B] = " + +b15); // output on console
    }
}
