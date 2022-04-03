package Week9;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */
public class Program_9_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> peopleNumber = new HashMap<String, Integer>();

        // Add keys and values (Name, ID)
        peopleNumber.put("Harsh", 102);
        peopleNumber.put("Saurabh", 103);
        peopleNumber.put("Shruti", 104);
        peopleNumber.put("Vrunda", 105);
        peopleNumber.put("Purvi", 106);
        peopleNumber.put("Kalpesh", 101);
        peopleNumber.put("Surbhi", 107);

        for (Map.Entry<String, Integer> peopleNum : peopleNumber.entrySet()) {
            System.out.println(peopleNum.getKey() + " = " + peopleNum.getValue());
            //System.out.println(peopleNum);
        }

    }
}

