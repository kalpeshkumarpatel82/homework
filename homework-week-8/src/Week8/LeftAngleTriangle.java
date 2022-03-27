package Week8;
/*
Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */
import java.util.Scanner;

public class LeftAngleTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Rows : "); //input wizard for a user
        int nrOfRows = scan.nextInt();
        LeftAngleTriangle obj = new LeftAngleTriangle();
        obj.leftAngTri(nrOfRows);
    }

    public void leftAngTri(int a) {
        int i, j;
        //for loop to print the left angle triangle
        for (i = 0; i < a; i++) {
            for (j = 2 * (a - i); j >= 0; j--) {
                System.out.print("");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}