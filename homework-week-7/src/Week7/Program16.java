package Week7;
/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;//Importing a Scanner class

public class Program16 {

    //Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number : ");//input wizard for a user
        int numbertocheck = scan.nextInt();
        Program16 program16 = new Program16();
        System.out.println(program16.isPosNegZero(numbertocheck));
    }

    //defining an instance method
    public String isPosNegZero(int a) {
        String output = "";

        if (a > 0) {
            output = a + " is Positive Number.";
        } else if (a < 0) {
            output = a + " is Negative Number.";
        } else
            output = a + " is Zero.";
        return output;
    }
}

