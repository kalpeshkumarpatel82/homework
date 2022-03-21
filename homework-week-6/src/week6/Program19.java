package week6;
/*
Objective of this program
Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program19 {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating a new Scanner object
        //String txt = "Hello World";
        System.out.println("Enter a UPPER CASE string to convert into a lower case  : "); //input wizard for a user
        String txt19 = input.nextLine();

        //System.out.println(txt19.toUpperCase());
        System.out.println(txt19.toLowerCase()); // converting to lowercase and printing to console
    }
}
