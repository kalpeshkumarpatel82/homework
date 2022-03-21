package week6;
/*
Objective of this program
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
...
8 x 10 = 80
 */

import java.util.Scanner; //Importing a Scanner Class

public class Program10 {
    //Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Creating a new Scanner object

        System.out.print("Enter a value for a table : ");  // Input wizard for a user
        int number = input.nextInt();

        System.out.println("Below is the table for the Given number [" + number + "]");
        for (int n = 1; n <= 10; n++) //for loop
            System.out.println(number + " x " + n + " = " + (number * n));


        // Alternate way to print without a FOR LOOP
        // ---------------------------------------------------
        //System.out.println(number + " x 1 = " + (number*1));
        //System.out.println(number + " x 2 = " + (number*2));
        // System.out.println(number + " x 3 = " + (number*3));
        // System.out.println(number + " x 4 = " + (number*4));
        // System.out.println(number + " x 5 = " + (number*5));
        // System.out.println(number + " x 6 = " + (number*6));
        // System.out.println(number + " x 7 = " + (number*7));
        // System.out.println(number + " x 8 = " + (number*8));
        // System.out.println(number + " x 9 = " + (number*9));
        // System.out.println(number + " x 10 = " + (number*10));

    }

}
