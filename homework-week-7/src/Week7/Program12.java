package Week7;
/*
Write a program that tells us input value is number or an alphabet or symbol
 */
import java.util.Scanner;//Importing a Scanner class

public class Program12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Defining a scanner object
        System.out.println("Please Any key : ");//input wizard for a user
        char input = sc.next().charAt(0);
        System.out.println(checkAlphaDigitSpe(input));
    }

    // Defining a Static method
    public static String checkAlphaDigitSpe(char a) {
        String msg = "";
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            msg = a+" is Alphabets.";
        } else if (a >= '0' && a <= '9') {
            msg = a+" is Digit.";
        } else
            msg = a+" is special character.";
        return msg;

    }

}

