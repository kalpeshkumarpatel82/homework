package week6;
/*
Objective of this program
Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).
 */

import java.util.Scanner; // Importing a Scanner Class

public class Program6 {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);  //Creating a new Scanner object
        System.out.print("Enter a radius to calculate area of the circle [in cm] : "); //Input wizard for user
        int radius = input.nextInt();
        System.out.println("Area of the Circle of [" + radius + "cm] radius is : " + pi * radius * radius + " cm²");

    }
}
