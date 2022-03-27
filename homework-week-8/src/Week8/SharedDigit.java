package Week8;
/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
 */

import java.util.Scanner;

public class SharedDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number :");
        int firstNumber = scan.nextInt();
        System.out.println("Enter Second number :");
        int secondnumber = scan.nextInt();
        System.out.println(hasSharedDigit(firstNumber, secondnumber));

    }

    // defining a method to find a shared digit
    public static String hasSharedDigit(int a, int b) {
        String msg;
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int a_lastdigit = a % 10; //last digit from first number
            int b_lastdigit = b % 10; //last digit from second number
            a = a / 10; //first digit from first number
            b = b / 10; //first digit from second number
            int a_firstdigit = a;
            int b_firstdigit = b;
            //condition to check the shared digit
            if ((a_firstdigit == b_firstdigit) || (a_firstdigit == b_lastdigit) || (a_lastdigit == b_firstdigit) || (a_lastdigit == b_lastdigit)) {
                msg = "Given numbers has a shared digits.";
            } else {
                msg = "Given numbers hasn't a shared digits.";
            }
        } else
            msg = "Invalid input"; //for invalid number outside the given range [10 to 99]
        return msg;
    }
}

