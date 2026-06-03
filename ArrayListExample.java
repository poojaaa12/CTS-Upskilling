import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> studentNames =
                new ArrayList<>();

        System.out.print(
                "How many students? ");

        int studentCount = input.nextInt();
        input.nextLine();

        for(int index = 0; index < studentCount; index++) {

            System.out.print("Enter name: ");

            studentNames.add(input.nextLine());
        }

        System.out.println("Student List");

        for(String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}
