package week6;
/*
Objective of this program
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    int a4 = 15; //instance variable
    int c4 = 10; //instance variable
    String currency4 = "USD"; //instance variable
    static int b4 = 50; //static variable
    static int d4 = 20; //static variable

    //Instant Method
    public void test5() {
        System.out.println("[Instance Method] : I have bills of " + a4 + " and " + b4 + " " + currency4 + " and coins of " + c4 + " and " + d4);
    }

    // Static method
    public static void test6() {
        Program4 program4 = new Program4(); //Defining object
        System.out.println("[Static Method] : Sum of a4, b4, c4 and d4 is = " + (program4.a4 + b4 + program4.c4 + d4));
    }

    //main method
    public static void main(String[] args) {
        Program4 program4 = new Program4(); //Defining object
        program4.test5(); // calling instance method
        test6(); //calling static method

    }
}
