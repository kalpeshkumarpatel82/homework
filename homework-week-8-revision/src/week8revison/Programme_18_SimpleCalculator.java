package week8revison;
/*
 * Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber
 * and secondNumber both of type double.
 * Write the following methods (instance methods):
 * Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
 * Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
 * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
 * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of
 * firstNumber and secondNumber.
 * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field
 * values of the secondNumber from the firstNumber.
 * Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the
 * field values of firstNumber and secondNumber.
 * Method named getDivisionResult without any parameters, it needs to return the result of dividing the field
 * values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * <p>
 * <p>
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * add= 9.0 is printed because 5.0 + 4 is 9.0
 * subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * divide= 0.0 is printed because secondNumber is set to 0
 */
public class Programme_18_SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0;
        } else
            return getFirstNumber() / getSecondNumber();
    }

    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
