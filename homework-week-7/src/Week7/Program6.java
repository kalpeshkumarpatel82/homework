package Week7;
/*
Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;//import of Scanner class

public class Program6 {

    //Main Method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Defining a Scanner method
        System.out.println("Enter any number : ");//input wizard for a user
        int number = scan.nextInt();
        Program6 program6 = new Program6();
        System.out.println(program6.isEvenOdd(number));
    }

    // defining an instance method
    public String isEvenOdd(int a){
        String result;
        if(a %2 == 0){
            result = a+ " is an EVEN number";
        }else
            result = a+ " is an ODD number";
        return result;
    }
}
