package Week8;
/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable, say reverse. Compare the number
with the reverse.
If both are the same then the number is a palindrome otherwise it is not.
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer number : ");
        int inputnumber = sc.nextInt();
        System.out.println(isPalindrome(inputnumber));

    }

    public static boolean isPalindrome(int number) {
        int sum = 0;
        boolean message;
        int temp = number; //storing number in the temp variable
        while (number != 0) {
            int b = number % 10; // finding a last digit
            sum = (sum * 10) + b;
            number = number / 10; // shifting to LSB
        }

        //Condition to check if number is Palindrome
        if (temp == sum)
            message = true;
        else
            message = false;
        return message;
    }
}
