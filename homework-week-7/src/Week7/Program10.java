package Week7;
/*
Write a java program to input any two number and ask user to enter their symbol (+, -,/, *)
find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;//import of Scanner class

public class Program10 {

    //static method for addition
    public static void addition(int a, int b) {
        System.out.println("a + b : " + (a + b));
    }

    //static method for subtraction
    public static void substraction(int a, int b) {
        System.out.println("b - a : " + (a - b));
    }

    //static method multiplication
    public static void multiplication(int a, int b) {
        System.out.println("a x b : " + a * b);
    }

    //static method division
    public static void division(int a, int b) {
        System.out.println("a / b : " + a / b);
    }

    //static method modulo
    public static void modulo(int a, int b) {
        System.out.println("a % b : " + a % b);
    }

    //static method average
    public static void avg(int a, int b) {
        System.out.println("avg of a & b : " + ((a + b) / 2));
    }


    public static void main(String[] args) {
        //System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : "); //import of Scanner class
        int number1 = sc.nextInt();
        System.out.println("Enter value of B : "); //import of Scanner class
        int number2 = sc.nextInt();
        System.out.println("Enter Operation which you want to perform [+, -, * , /, % or A (or a) ] : "); //import of Scanner class
        char string1 = sc.next().charAt(0);

        if (string1 == '+') {
            addition(number1, number2);
        } else if (string1 == '-') {
            substraction(number1, number2);
        } else if (string1 == '*') {
            multiplication(number1, number2);
        } else if (string1 == '/') {
            division(number1, number2);
        } else if (string1 == '%') {
            modulo(number1, number2);
        } else if (string1 == 'A' || string1 == 'a') {
            avg(number1, number2);
        } else {
            System.out.println("Please enter a valid key for an operation!!");
        }


    }

}
