package Week7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then find this sales Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
Sales amount >= 20,000 10%
Sales amount >= 10,000 5%
Sales amount < 10,000 2%
 */
import java.util.Scanner;//import of Scanner class

public class Program7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Defining a Scanner method
        System.out.println("Please Enter Sales ID : ");//input wizard for a user
        int saleID = scan.nextInt();
        System.out.println("Please Enter Saller's Name : ");//input wizard for a user
        String sallerName = scan.next();
        System.out.println("Please Enter Sales Amount : ");//input wizard for a user
        int saleAmt = scan.nextInt();
        System.out.println("Please Enter Salary Basic : ");//input wizard for a user
        int salaryBasic = scan.nextInt();
        Program7 program7 = new Program7();
        System.out.println("Sales commission for " + sallerName+" [Sale's ID : "+saleID+ "] based on Sales Amount "+"[" + saleAmt+"] is " +program7.commission(saleAmt) + " % or " + ((program7.commission(saleAmt) *saleAmt)/100) + " USD");
    }

    // defining an instance method
    public int commission(int a) {
        int com = 0;
        if (a >= 50000) {
            com = 35;
        } else if (a >= 30000 && a < 49999) {
            com = 20;
        } else if (a >= 20000 && a < 29999) {
            com = 10;
        } else if (a >= 10000 && a < 19999) {
            com = 5;
        } else {
            com = 2;
        }
        return com;

    }

}
