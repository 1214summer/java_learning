package homework.second;

class Calculator {
    public double add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction: " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }

        double result = a / b;
        System.out.println("Division: " + result);
        return result;
    }
}
public class work3{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        calculator.add(3.0, 2.0);
        calculator.subtract(5.0, 3.0);
        calculator.multiply(2.0, 5.0);
        calculator.divide(10.0, 4.0);
        calculator.divide(8.0, 0.0);  // 测试除法中的除零情况
    }
}
