package Week8;
/*
 Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check if it is prime number or not : ");
        int PriNum = scan.nextInt();
        PrimeNumber obj = new PrimeNumber();
        obj.primeNumber(PriNum);
    }

    //instance method to find the given number is prime or not
    public void primeNumber(int a) {
        int result = 0;
        //logic to find a prime number
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                result = 0;
                break;
            } else {
                result = 1;
            }

        }
        //condition to check if number is prime or not
        if (result == 0) System.out.println(a + " is a not prime number");
        else System.out.println(a + " is a prime number");

    }

}
