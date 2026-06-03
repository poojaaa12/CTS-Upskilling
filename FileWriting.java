import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String enteredText = input.nextLine();

        try {

            FileWriter fileWriter =
                    new FileWriter("output.txt");

            fileWriter.write(enteredText);

            fileWriter.close();

            System.out.println(
                    "Data written successfully");

        }
        catch(Exception error) {
            System.out.println(error);
        }
    }
}
