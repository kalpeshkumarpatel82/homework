package Week7;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry (If statement)
 */
import java.util.Scanner;//import of Scanner class

public class Program8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Defining a Scanner method
        System.out.println("Please enter first letter of the city Name : ");//input wizard for a user
        char city = scan.next().charAt(0);
        System.out.println(cityName(city));

    }
    // defining a Static instance method
    public static String cityName(char n) {
        String cityName;
        if (n == 'A' || n == 'a') {
            cityName = "Ahmedabad";
        } else if (n == 'B' || n == 'b') {
            cityName = "Baroda";
        } else if (n == 'C' || n == 'c') {
            cityName = "Chandigarh";
        } else if (n == 'D' || n == 'd') {
            cityName = "Delhi";
        } else if (n == 'E' || n == 'e') {
            cityName = "Etawah";
        } else if (n == 'F' || n == 'f') {
            cityName = "Firozabad";
        } else
            cityName = "Invalid Entry";
        return cityName;
    }
}


