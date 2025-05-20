
import java.util.Scanner;

public class Program1 {

    static class Calculator {

        double a, b;
        String operation;

        Calculator(double a, double b, String operation) {
            this.a = a;
            this.b = b;
            this.operation = operation.toLowerCase();
        }

        public String calculate() {
            switch (operation) {
                case "add":
                    return String.valueOf(a + b);
                case "subtract":
                    return String.valueOf(a - b);
                case "multiply":
                    return String.valueOf(a * b);
                case "divide":
                    return b != 0 ? String.valueOf(a / b) : "Error: Division by zero";
                default:
                    return "Invalid operation";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        System.out.println("The " + operation + " of " + a + " and " + b + " is " + calc.calculate());
    }
}
