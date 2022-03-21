package week6;
/*
Objective of this program
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.text.DecimalFormat; // Importing a DecimalFormat Class

public class Program14 {
    //Main method
    public static void main(String[] args) {
        float w = 5.6f;
        float h = 8.5f;
        float area1, peri1;

        DecimalFormat df = new DecimalFormat("0.00"); // defining a decimalformat object
        area1 = w * h; //Formulas for Area of rectangle
        peri1 = 2 * (w + h); // Formulas for Perimeter of rectangle

        System.out.println("Area of rectangle is " + w + " x " + h + " = " + df.format(area1));
        System.out.println("Perimeter of rectangle is 2 x (" + w + " + " + h + ") = " + df.format(peri1));

    }
}
