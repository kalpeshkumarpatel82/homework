package Week7;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%, DA = Basic salary 8%, TA = Basic salary 9%, PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip                  |
|______________________________|
| Employee Id : 2564           |
| Employee Name : Jay          |
|______________________________|
| Basic Salary : 25000.0       |
| HRA 10% : 2500.0             |
| TA 8% : 2250.0               |
| DA 9% : 2000.0               |
| PF - 20& : 5000.0            |
|______________________________|
| Gross Salary : 26750.0       |
|==============================|
 */
import java.util.Scanner;//import of Scanner class

public class Program5 {
    //Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Defining a Scanner method
        System.out.println("Enter employee ID : ");//input wizard for a user
        int eID = scan.nextInt();
        System.out.println("Enter employee name : ");//input wizard for a user
        String empName = scan.next();
        System.out.println("Enter Basic salary of the employee : ");//input wizard for a user
        float basicSalary = scan.nextFloat();
        System.out.println("|---------------------------------------|");
        System.out.println("|               SALARY SLIP             |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Employee ID     : " + eID + "\t\t\t\t|");
        System.out.println("| Employee ID     : " + empName + "\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("| Basic Salary    : " + basicSalary + "\t\t\t\t|");
        System.out.println("| HRA 10%         : " + hra(basicSalary) + "\t\t\t\t|");
        System.out.println("| TA 8%           : " + ta(basicSalary) + "\t\t\t\t|");
        System.out.println("| DA 9%           : " + da(basicSalary) + "\t\t\t\t|");
        System.out.println("| PF 20%          : " + pf(basicSalary) + "\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("| Gross Salary    : " + grossSalary(basicSalary) + "\t\t\t\t|");
        System.out.println("|---------------------------------------|");


    }

    // defining a static method
    public static float hra(float a) {
        return a * 0.10f;
    }

    // defining a static method
    public static float da(float a) {
        return a * 0.09f;
    }

    // defining a static method
    public static float ta(float a) {
        return a * 0.08f;
    }

    // defining a static method
    public static float pf(float a) {
        return a * 0.20f;
    }

    // defining a static method
    public static float grossSalary(float a) {
        return a + hra(a) + da(a) + ta(a) - pf(a);

    }
}
