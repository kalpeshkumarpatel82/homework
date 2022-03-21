package week6;
/*
Objective of this program
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation methods.
(Note: Two static and Two instance methods.)
 */
public class Program5 {
    float a5 = 5; //Instance Variable
    float b5 = 20; //Instance Variable
    static float c5 = 8; //Static Variable
    static float d5 = 40; //Static Variable

    //instance method
    public void addition() {

        System.out.println("a5 + b5 : " + (a5 + b5));
        System.out.println("c5 + d5 : " + (Program5.c5 + Program5.d5));
        System.out.println();


    }

    //instance method
    public void substration() {

        System.out.println("b5 - a5 : " + (b5 - a5));
        System.out.println("d5 - c5 : " + (Program5.d5 - Program5.c5));
        System.out.println();

    }

    //static method
    public static void multiplication() {
        Program5 program5 = new Program5(); //Defining object
        System.out.println("a5 x b5 : " + program5.a5 * program5.b5);
        System.out.println("c5 x d5 : " + program5.d5 * program5.c5);
        System.out.println();

    }

    //static method
    public static void division() {
        Program5 program5 = new Program5(); //Defining object
        System.out.println("a5 / b5 : " + program5.a5 / program5.b5);
        System.out.println("d5 / c5 : " + program5.d5 / program5.c5);

    }

    public static void main(String[] args) {
        //System.out.println("");

        Program5 program5 = new Program5(); //Defining object
        System.out.print("Given : ");
        System.out.print("a5 = " + program5.a5 + ", ");
        System.out.print("b5 = " + program5.b5 + ", ");
        System.out.print("c5 = " + c5 + ", ");
        System.out.println("d5 = " + d5);
        System.out.println();


        program5.addition(); //Calling Instance method
        program5.substration(); //Calling Instance method
        multiplication(); //Calling static method
        division(); //Calling static method
    }
}
