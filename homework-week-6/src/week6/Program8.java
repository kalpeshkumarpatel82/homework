package week6;
/*
Objective of this program
Write a program to calculate the area of a triangle
Formulas : Triangle area = (Base x Height) / 2
 */

import java.util.Scanner;//Importing a Scanner Class

public class Program8 {
    //Main Method
    public static void main(String[] args) {
        double triarea;
        Scanner input = new Scanner(System.in); //Creating a new Scanner object
        System.out.print("Enter a value for Triangle Base [in cm]: "); //User wizard to enter Base value
        double base = input.nextInt();
        System.out.print("Enter a value for Triangle Height [in cm]: "); //User wizard to enter Height value
        double height = input.nextInt();
        triarea = (base * height) / 2; //Formulas to calculate Triangle area
        System.out.println("Area of triangle is : " + triarea + " cm²");
    }
}
