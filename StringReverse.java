import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String textValue = input.nextLine();

        String reversedText =
                new StringBuilder(textValue).reverse().toString();

        System.out.println("Reversed String: " + reversedText);
    }
}
