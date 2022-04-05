package week8revison;

import java.util.Scanner;

/*
First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop
and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
gives us 0+0 and the sum is 0.
* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
gives us 5+5 and the sum is 10.
* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_7_FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int r, rev = 0, fd, ld, s;
        ld = number % 10;
        while (number > 0) {
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd = rev % 10;
        s = fd + ld;
        return s;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        System.out.println(" The sum of first & last digit is: " + sumFirstAndLastDigit(a));
        //Closing the scanner object
        scanner.close();
    }
}
