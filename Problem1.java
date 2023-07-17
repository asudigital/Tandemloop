import java.util.Scanner;

class Problem1 {
    private double a;
    private double b;

    public Problem1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator(a, b);

        double result;

        switch (operation) {
            case "+":
                result = calculator.add();
                break;
            case "-":
                result = calculator.subtract();
                break;
            case "*":
                result = calculator.multiply();
                break;
            case "/":
                result = calculator.divide();
                break;
            default:
                System.out.println("Invalid operation type.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

