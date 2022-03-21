package week6;
/*
Objective of this program
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;// Importing a Scanner Class

public class Program13 {
    //main method
    public static void main(String[] args) {
        double average;
        Scanner input = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Enter a first value : "); //Input wizard for user input
        int number1 = input.nextInt();
        System.out.print("Enter a second value : "); //Input wizard for user input
        int number2 = input.nextInt();
        System.out.print("Enter a third value : "); //Input wizard for user input
        int number3 = input.nextInt();
        average = (number1 + number2 + number3) / 3;
        System.out.println("Average of given numbers are : " + average); //Output on Console

    }
}
