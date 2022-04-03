package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Scrum");
        list1.add("Java");
        list1.add("Jira");
        list1.add("Selenium");
        list1.add("Cucumber");
        list1.add("Postman");
        list1.add("Rest Assured");

        for (String listname : list1) {
            System.out.println(listname);
        }


    }
}

