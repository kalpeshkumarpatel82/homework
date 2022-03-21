package week6;

/*
Objective of this program
Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    static int a2 = 10; //Static variable one
    static int b2 = 20; //Static variable two

    // Static method
    public static void test1() {
        System.out.println("a2 + b2 = " + (a2 + b2));
    }

    // Main method
    public static void main(String[] args) {
        test1(); //calling static method inside main method
    }


}
