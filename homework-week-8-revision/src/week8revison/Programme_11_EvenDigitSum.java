package week8revison;

import java.util.Scanner;

/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastdigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastdigit = number % 10;
            if (lastdigit % 2 == 0) {
                evenDigitSum += lastdigit;
            }
            number = number / 10;

        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        //Scanner declaration fro reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        int result = getEvenDigitSum(a);
        System.out.println("The sum of even digit is : " + result);
        //Closing the scanner object
        scanner.close();
    }
}
