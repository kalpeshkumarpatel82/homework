package week8revison;

import java.util.Scanner;

/*
Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
*/
public class Programme_12_PrimeNumber {
    public static void isPrimeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        isPrimeNumber(a);
        //Closing the scanner object
        scanner.close();
    }

}
