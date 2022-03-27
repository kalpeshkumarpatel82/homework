package Week8;
/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

import java.util.Scanner;

public class TrianglePatternPrint {

    public static void main(String[] args) {
        TrianglePatternPrint obj = new TrianglePatternPrint();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int numberOfRows = sc.nextInt();
        obj.printTrianglePattern(numberOfRows);
    }

    // defining a method to print triangle
    public void printTrianglePattern(int a) {

        //for loop to print a triangle of the given length
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
