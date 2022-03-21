package Week7;
/*

 */

public class Person {
    String firstName; //instance variable
    String lastName; // instance variable
    int age; // instance variable

    // main method
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }

    //Defining an instance method
    public String getFirstName() {
        return firstName;
    }

    //Defining an instance method
    public String getlastName() {
        return lastName;
    }

    //Defining an instance method
    public int getAge() {
        return age;
    }

    //Defining an instance method with return
    public String setFirstName(String fname) {
        firstName = fname;
        return fname;
    }

    //Defining an instance method with return
    public String setLastName(String lname) {
        lastName = lname;
        return lname;
    }

    //Defining an instance method with return
    public int setAge(int age1) {
        if (age1 >= 0 && age1 <= 100) {
            age = age1;
        } else
            age = age1 = 0;
        return age;
    }

    //Defining an instance method with return
    public boolean isTeen() {
        boolean result;
        if (age >= 12 && age < 20) {
            result = true;
        } else
            result = false;
        return result;
    }

    //Defining an instance method with return
    public String getFullName() {
        String fullname = firstName + " " + lastName;
        return fullname;
    }

    public String isEmpty() {
        if (firstName.isEmpty()) {
            return firstName;
        }

        if (lastName.isEmpty()) {
            return lastName;
        }

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        }

        String fullname = firstName + " " + lastName;
        return fullname;

    }
}
