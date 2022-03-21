package Week7;

/*
Write a Java program to calculate the average value of array elements.
 */
public class Program19 {
    static double my_array4[] = {1000, 2111, 7778, 4008, 5500};

    //Main Method
    public static void main(String[] args) {
        avgArrays(); // callinhd a static method
    }

    // Defining a static method
    public static void avgArrays() {
        double sum = 0;
        for (int j = 0; j < my_array4.length; j++) {
            sum = sum + my_array4[j];
        }
        double average = sum / my_array4.length;
        System.out.println("The sum is " + average);
    }
}
