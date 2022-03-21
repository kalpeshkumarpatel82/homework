package week6;
/*
Objective of this program
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    int a1 = 10; //Instant Variable One
    int b1 = 20; //Instant Variable Two
    String currency1 = "USD"; //Instant Variable Three

    //Instant Method
    public void test() {
        // Calling Instance variables into Instance method
        System.out.println("I have bills of " + a1 + " and " + b1 + " " + currency1);
    }

    //Main method
    public static void main(String[] args) {
        Program1 program1 = new Program1(); //Defining an object
        program1.test(); //Calling Instant method in Main method
    }
}
