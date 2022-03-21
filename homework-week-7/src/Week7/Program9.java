package Week7;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry (switch statement).
 */
import java.util.Scanner;//Importing a scanner class

public class Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first letter of the city Name : ");//input wizard for a user
        char city1 = scan.next().charAt(0);
        //System.out.println(city1);
        cityName1(city1); // Calling a static method

    }

    // Defining a static method
    public static void cityName1(char n) {

        switch (n) {
            case 'A':
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'B':
            case 'b':
                System.out.println("Baroda");
                break;
            case 'C':
            case 'c':
                System.out.println("Chandigarh");
                break;
            case 'D':
            case 'd':
                System.out.println("Delhi");
                break;
            case 'E':
            case 'e':
                System.out.println("Etawah");
                break;
            case 'F':
            case 'f':
                System.out.println("Firozabad");
                break;
            default:
                System.out.println("!! Invalid Entry.");
                break;
        }
    }
}


