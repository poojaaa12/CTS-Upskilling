import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String textValue = input.nextLine();

        textValue = textValue.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reversedText =
                new StringBuilder(textValue).reverse().toString();

        if(textValue.equals(reversedText))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
