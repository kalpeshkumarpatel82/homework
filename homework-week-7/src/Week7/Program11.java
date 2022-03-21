package Week7;
/*
Write a java program to print the numbers between 1 and 100 which can be divided by 3 and 5 separately.
 */
public class Program11 {

    public static void main(String[] args) {
        Program11 obj = new Program11();

        System.out.println("Printed number can be divided by 3 :");//input wizard for a user
        for (int i = 1; i <= 100; i++) {
            obj.numdiviedbythree(i);
        }
        System.out.println("");
        System.out.println("Printed number can be divided by 5:");//input wizard for a user
        for (int j = 1; j <= 100; j++) {
            obj.numdiviedbyfive(j);
        }

    }
    //Instance method
    public void numdiviedbythree(int a) {
        if (a % 3 == 0) System.out.print(a+"\t");
    }
    //Instance method
    public void numdiviedbyfive(int a) {
        if (a % 5 == 0) System.out.print(a+"\t");
    }
}
