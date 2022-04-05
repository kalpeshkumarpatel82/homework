package week8revison;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Programme_6_NumberTriangle {

    public static void numTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows :");
        //Calls static method
        numTriangle(scanner.nextInt());
        //Closing the scanner object
        scanner.close();
    }
}
