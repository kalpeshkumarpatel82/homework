package Week8;
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

import java.util.Scanner;

public class TriangePrint {
    public static void main(String[] args) {
        TriangePrint obj = new TriangePrint();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int numberOfRows = sc.nextInt();
        obj.printtriangle(numberOfRows);
    }

    // defining a method to print triangle
    public void printtriangle(int a) {
        //for loop to print a triangle of the given length
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
