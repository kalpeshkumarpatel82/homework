package week8revison;

import java.util.Scanner;
/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
*/

public class Programme_8_SymbolTriangle {
    public static void symbolTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        //Closign the scanner object
        scanner.close();
    }
}
