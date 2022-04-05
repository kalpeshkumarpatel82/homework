package programme_23_method_overriding;

/*
Creating a child class
 */
public class Bike extends Vehicle {
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // Creating object
        obj.run();//calling method
    }
}
