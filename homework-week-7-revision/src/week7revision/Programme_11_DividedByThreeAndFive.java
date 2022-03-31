package week7revision;

public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i<=100; i++){
            dividedByThree(i);
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------");
        for (int j = 1;j<=100;j++){
            dividedByFive(j);
        }
    }
    //Divided By three method
    public static void dividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.print(number + "\t");
        }
    }

    //Divided byFive method
    public static void dividedByFive(int number) {
        if(number % 5 == 0){
            System.out.print(number + "\t");
        }
    }
}
