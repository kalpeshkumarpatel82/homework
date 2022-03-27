package Week8;
/*
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a length of the Fibonacci Series [Valid input 1 to 44]: ");
        int fibonacciLen = scan.nextInt();

        obj.fibonaaci(fibonacciLen);
    }

    public void fibonaaci(int a) {
        int n1 = 0; //first number of the fibonaaci
        int n2 = 1;//Second number of the fibonaaci
        int n3;
        if (a < 45) {
            System.out.print(n1 + "\t" + n2);
            for (int i = 0; i <= a; i++) {
                n3 = n1 + n2;
                System.out.print("\t" + n3);
                n1 = n2;
                n2 = n3;
            }
        }else {
            System.out.println("!!! Given number is out of Scope of Integer Data type.");
        }
    }
}
