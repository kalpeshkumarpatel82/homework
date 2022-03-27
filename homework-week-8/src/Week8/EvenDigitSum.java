package Week8;
/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negativeNOTE: The method getEvenDigitSum should be defined as public static
 */
import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int numSumEven = scan.nextInt();

        if (getEvenDigitSum(numSumEven) != -1) {
            System.out.println("The sum of even digits of the given number [" + numSumEven + "] is : " + getEvenDigitSum(numSumEven));
        } else {
            System.out.println("Invalid Input." + getEvenDigitSum(numSumEven));
        }
    }

    public static int getEvenDigitSum(int number) {
        int lastdigit;
        int sum = 0;
        if (number > 0) {
            while (number > 0) {
                lastdigit = number % 10; // separating a last digit
                if (lastdigit % 2 == 0) //check if last digit is Even on not, if it is even then add else ignore it
                {
                    sum = sum + lastdigit;
                }
                number = number / 10;
            }
        } else
            sum = -1;
        return sum;
    }
}
