import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

            int divisionResult = firstNumber / secondNumber;

            System.out.println("Result = " + divisionResult);

        } catch(ArithmeticException error) {

            System.out.println("Cannot divide by zero.");
        }
    }
}
