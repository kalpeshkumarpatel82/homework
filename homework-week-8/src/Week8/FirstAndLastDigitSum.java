package Week8;
/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
gives us 0+0 and the sum is 0.
* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
gives us 5+5 and the sum is 10.
* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any Number : "); // input wizard for a user
        int userNumber = sc.nextInt();
        System.out.println("Sum of first and last digits are : " + sumFirstAndLastDigit(userNumber));
    }

    public static int sumFirstAndLastDigit(int a) {
        int sum = 0;
        int lastdigit = a % 10; // finding the last digit
        if (a > 0) {
            //finding a first digit
            while (a != 0) {
                int b = a % 10;
                sum = b;
                a = a / 10;
            }
        } else {
            return -1;
        }
        return lastdigit + sum;
    }
}

