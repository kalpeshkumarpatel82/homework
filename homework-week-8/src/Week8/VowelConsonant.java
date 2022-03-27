package Week8;
/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
import java.util.Locale;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        VowelConsonant obj = new VowelConsonant();
        obj.VowelCheck();
    }

    public void VowelCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet :");
        String s = sc.nextLine();
        String s1 = s.toLowerCase(Locale.ROOT); //Convert entered character to lower case
        char ch = s1.charAt(0);
        boolean flag = Character.isAlphabetic(ch);
        // checking if entered character is Vowel or Consonant
        if (s1.length() == 1 && flag) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u')
                System.out.println(ch + " is vowel.");
            else
                System.out.println(ch + " is consonant.");
        } else
            System.out.println("Invalid input.");
    }
}
