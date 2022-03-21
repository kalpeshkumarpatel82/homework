package Week7;
/*
Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class Program17 {
    static int[] myarrays1 = {1000, 2000, 4500, 1500, 8900};
    static String[] myarrays2 = {"Kalpesh", "Sheel", "Hriday", "Arati", "Patel", "Ahmedabad"};

    //Main Method
    public static void main(String[] args) {
        sortArrays();

    }

    //Defining a Static method
    public static void sortArrays() {

        System.out.println("My original Arrays : " + Arrays.toString(myarrays1));
        Arrays.sort(myarrays1);
        System.out.println("After sorting [Ascending order : min_number to max_number] : " + Arrays.toString(myarrays1));
        System.out.println("");
        System.out.println("My original Arrays : " + Arrays.toString(myarrays2));
        Arrays.sort(myarrays2);
        System.out.println("After sorting [Ascending order : A to Z] : " + Arrays.toString(myarrays2));

    }
}
