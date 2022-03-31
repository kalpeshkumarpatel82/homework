package week7revision;

import java.util.Arrays;

/*
 Write a Java program to calculate the average value of array
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        //Numeric arrays declaration
        int[] numArray = {1798, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //Calculating the sum of arrays values
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        //Finding the average of array values
        int average = sum / numArray.length;
        System.out.println("Values ood the elements of the arrys are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the arrays are : " + average);
    }
}
