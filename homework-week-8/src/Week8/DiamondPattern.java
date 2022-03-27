package Week8;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int numStar = scan.nextInt();
        DiamondPattern obj = new DiamondPattern();
        obj.diamondPattern(numStar);
    }

    public void diamondPattern(int n) {
//        int i, j;
//        for (i = 0; i <= a; i++) {
//            for (j = 1; j <= a - i; j++)
//                System.out.print(" ");
//            for (j = 1; j <= 2 * i - 1; j++)
//                System.out.print("*");
//            System.out.print("\n");
//        }
//        for (i = a - 1; i >= 1; i--) {
//            for (j = 1; j <= a - i; j++)
//                System.out.print(" ");
//            for (j = 1; j <= 2 * i - 1; j++)
//                System.out.print("*");
//            System.out.print("\n");
//
//        }

        int i = 1;
        int j;
        while (i <= n) {
            j = 1;

            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

        i = n - 1;

        while (i > 0) {


            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;


        }
    }
}
