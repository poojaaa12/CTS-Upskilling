import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter operation (+,-,*,/): ");
        char operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println("Result = " + (firstNumber+secondNumber));
                break;
            case '-':
                System.out.println("Result = " + (firstNumber-secondNumber));
                break;
            case '*':
                System.out.println("Result = " + (firstNumber*secondNumber));
                break;
            case '/':
                System.out.println("Result = " + (firstNumber/secondNumber));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
