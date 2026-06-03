import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacci(int number) {

        if(number <= 1)
            return number;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int termNumber = input.nextInt();

        System.out.println("Fibonacci = " + fibonacci(termNumber));
    }
}
