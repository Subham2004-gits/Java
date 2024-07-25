package Java;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double d2 = sc.nextDouble();
        sc.nextLine(); // consume the newline character
        System.out.print("What operation do you want to perform (sum, subtract, multiply, division): ");
        String operations = sc.nextLine();
        switch (operations.toLowerCase()) {
            case "sum":
                System.out.printf("%f + %f = %f%n", d1, d2, d1 + d2);
                break;
            case "subtract":
                System.out.printf("%f - %f = %f%n", d1, d2, d1 - d2);
                break;
            case "multiply":
                System.out.printf("%f * %f = %f%n", d1, d2, d1 * d2);
                break;
            case "division":
                if (d2 != 0) {
                    System.out.printf("%f / %f = %f%n", d1, d2, d1 / d2);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose from sum, subtract, multiply, or division.");
                break;
        }
        sc.close();
        System.out.println("Calculator closed.");
    }
}

