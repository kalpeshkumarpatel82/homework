package Week7;

/*
Write a Java program to sum values of an array
 */
public class Program18 {
    int my_array3[] = {1000, 2000, 3000, 4000, 5000};

    // Main method
    public static void main(String[] args) {
        Program18 program18 = new Program18();
        program18.sumArrays();
    }

    // Defining a static method
    public void sumArrays() {
        int sum = 0;
        for (int k = 0; k < my_array3.length; k++) {
            sum = sum + my_array3[k];
        }
        System.out.println("The sum is " + sum);
    }

}
