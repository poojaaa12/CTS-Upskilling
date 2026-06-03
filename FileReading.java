import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {

    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("output.txt"));

            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }

            reader.close();
        }
        catch(Exception error) {
            System.out.println(error);
        }
    }
}
