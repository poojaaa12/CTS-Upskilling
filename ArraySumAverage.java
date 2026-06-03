import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        int numbers[] = new int[size];

        int total = 0;

        for(int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
            total += numbers[index];
        }

        double average = (double)total / size;

        System.out.println("Sum = " + total);
        System.out.println("Average = " + average);
    }
}
