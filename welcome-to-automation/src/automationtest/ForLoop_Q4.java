package automationtest;

public class ForLoop_Q4 {

    public void printMyName(String name, int howManyTime){
        for(int i=1;i<=howManyTime;i++){
            //System.out.println(i+" "+name); //uncomment to see the index number
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Kalpesh",15);
        //System.out.println(""); //uncomment to see the space beween two outputs
        obj.printMyName("Kalpesh",10);
    }
}
