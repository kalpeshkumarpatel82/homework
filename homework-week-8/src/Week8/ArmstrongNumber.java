package Week8;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check if it is Armstrong number or not :");
        int numArm = scan.nextInt();
        ArmstrongNumber obj = new ArmstrongNumber();
        System.out.println(obj.isArmstrongNumber(numArm));


    }

    public String isArmstrongNumber(int a){
        double sum = 0;
        int digit = 0;
        int last = 0;
        String message;

        //finding the length of the given number
        int temp = a;
        while (temp>0) {
            temp = temp/10;
            digit++;
        }
        temp = a;
        while(temp>0) {
            last = temp%10; // finding the last digit from the given number
            sum = sum + (Math.pow(last,digit));
            temp =temp/10; // removing the last digit
        }

        //Comparing the sum with original input
        if (a == sum)
            message = "Given Number is Armstrong Number.";
        else
            message = "Given Number is not Armstrong Number.";
        return message;
    }
    }

