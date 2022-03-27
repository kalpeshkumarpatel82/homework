package Week8;
/*
Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:,
the next Enter number #2:, and so on.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {
    // Main method
    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.numberSum();
    }

    // A method to check and calculate the sum of the valid integer numbers
    public void numberSum() {
        int sum = 0;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number #" + count); //Input wizard for a user
            boolean validnumber = scan.hasNextInt();

            // Checking if the entered number is valid or not
            if (validnumber) {
                int number = scan.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
    }
}
