package week8revison;

import java.util.Scanner;
/*
 14 Write a program in Java to display the pattern like a diamond.
 While loop
       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
*/

public class Programme_14_DiamondPattern {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ < r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of row :");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        printDiamond(a, c);
        //Closing the scanner object
        scanner.close();
    }
}
