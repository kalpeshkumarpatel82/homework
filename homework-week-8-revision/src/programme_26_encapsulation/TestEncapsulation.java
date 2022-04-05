package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Kalpesh");
        obj.setAge(25);
        obj.setRollNo(101);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll no: " + obj.getRollNo());

        //Direct access of rollNo is not possible due to encapsulation
        //System.out.println("Student's roll No: " + obj.getName);
    }
}
