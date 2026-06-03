import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int tableNumber = input.nextInt();

        for(int multiplier=1;multiplier<=10;multiplier++) {
            System.out.println(tableNumber + " x " + multiplier + " = " + (tableNumber*multiplier));
        }
    }
}
