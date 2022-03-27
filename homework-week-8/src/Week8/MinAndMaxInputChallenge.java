package Week8;
/*Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.minAndMax();
    }

    public void minAndMax() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int min = 0;
        int max = 0;
        boolean res = true;
        while (true) {
            int cnt = count++;
            System.out.println("Enter number #" + (cnt + 1) + ": ");
            boolean firstnumber = scan.hasNextInt();

            // Checking the number is min or max
            if (firstnumber) {
                int fnumber = scan.nextInt();
                if (res) {
                    res = false;
                    min = fnumber;
                    max = fnumber;
                }
                if (fnumber < min) {
                    min = fnumber;
                } else if (fnumber > max) {
                    max = fnumber;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scan.nextLine();
        }
        System.out.println("Minimun = " + min);
        System.out.println("Maximum = " + max);
    }
}