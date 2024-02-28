import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double memory = 0.0;

        while (true) {
            System.out.println("Current memory value: " + memory);
            System.out.println("Enter the first number (or 'M' to use memory):");
            String input1 = scanner.next();

            double num1;
            if (input1.equalsIgnoreCase("M")) {
                num1 = memory;
            } else {
                num1 = Double.parseDouble(input1);
            }

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation (+, -, *, /):");
            String operation = scanner.next();

            double result = 0.0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please select from +, -, *, /");
            }

            memory = result;

            System.out.println("The result is: " + result);
            System.out.println("Press 'Q' to quit or any key to continue:");
            String quit = scanner.next();
            if (quit.equalsIgnoreCase("Q")) {
                break;
            }
          aad
        }
    }
}
