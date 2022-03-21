package week6;
/*
Objective of this program
Write a program to convert the UPPER CASE to lower case.
 */

import java.util.Scanner; //Importing a Scanner Class

public class Program9 {
    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating a new Scanner object
        //String txt = "Hello World";
        System.out.print("Enter a UPPER CASE string to convert into a lower case :\n"); //User wizard to input a text in Upper case
        String txt = input.nextLine();
        //System.out.println(txt.toUpperCase());
        System.out.println("Your entered UPPER CASE string is converted to lower case :\n" + txt.toLowerCase()); //Output on Console
    }
}
