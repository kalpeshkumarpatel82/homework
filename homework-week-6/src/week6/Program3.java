package week6;
/*
Objective of this program
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int a3 = 10; //instance variable
    static int b3 = 20; //static variable
    String currency3 = "USD"; //instance variable

    // instance method
    public void test3() {
        System.out.println("[Using Instant method] : I have bills of " + a3 + " and " + b3 + " " + currency3);
    }

    // Static method
    public static void test4() {
        Program3 program3 = new Program3(); //defining object
        System.out.println("[Static Method] : Sum of a3 + b3 = " + (program3.a3 + b3));
    }

    //Main method
    public static void main(String[] args) {
        Program3 program3 = new Program3(); //Defining object
        program3.test3(); // calling instance method
        test4(); // calling static method

    }
}
