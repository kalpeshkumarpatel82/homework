package Week7;
/*
Write a java program that tells us that Input number is odd or even?
Using a ternary operator (? :)
 */

import java.util.Scanner; //import of Scanner class

public class Program1 {
    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Defining a Scanner method
        System.out.println("Please enter any Integer Number : ");//input wizard for a user
        int a = sc.nextInt();
        Program1 obj = new Program1(); // Defining an object
        System.out.println(obj.EvenOdd(a)); // calling a method
    }

    // defining an Instance method : with return with parameters
    public String EvenOdd(int a) {
        return (a % 2 == 0) ? "Even Number" : "Odd Number";// Use of the ternary operator
    }
}
