package junit5;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0)
            throw new ArithmeticException();
        return num1 / num2;
    }
}
