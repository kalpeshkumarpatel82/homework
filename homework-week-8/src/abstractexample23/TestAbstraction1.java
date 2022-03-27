package abstractexample23;
//In real scenario, method is called by programmer or user
public class TestAbstraction1 {
    public static void main(String args[]) {
        Shape s = new Circle1();//In a real scenario, object is provided through method, e.g. getShape() method
        s.draw();
    }
}
