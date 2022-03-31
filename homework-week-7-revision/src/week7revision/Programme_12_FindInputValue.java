package week7revision;

import java.util.Scanner;

/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        char ch = scanner.next().charAt(0);
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }

    // Find the input values is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT");
        } else {
            System.out.println(ch + " is a SYMBOL");
        }

    }
}
