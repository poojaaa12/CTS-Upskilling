import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = 1;

        for(int factor = 1; factor <= number; factor++) {
            factorial *= factor;
        }

        System.out.println("Factorial = " + factorial);
    }
}
