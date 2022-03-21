package Week7;
/*
Write a Java program to test if an array contains a specific value.
 */

import java.util.Arrays; //importing a arrays class
import java.util.Scanner;//importing a Scanner class

public class Program20 {
    static int my_array5[] = {1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 3001};

    // Main method
    public static void main(String[] args) {

        System.out.println("My arrays : " + Arrays.toString(my_array5));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is present in the given arrays : ");// input wizard for a user
        int testdata = scan.nextInt();
        System.out.println(isContain(my_array5, testdata));

    }

    // defiling a method
    public static boolean isContain(int[] arra, int a) {
        for (int n : arra)  //Alternative method
            //for (int n = 0; n < arra.length; n++) {
            if (a == n) {
                return true;
            }
            return false;
        }
    }






