package week8revison;

import java.util.Scanner;
/*
Read the numbers from the console entered by the user and print the minimum and maximum number
the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
*/

public class Programme_2_MinAndMaxInputChallenge {
    public static void findMinAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //While loop
        while (true) {
            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min = "+min + ", Max = "+ max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMaxInputChallenge();
    }
}
