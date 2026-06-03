import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<Integer,String> studentRecords =
                new HashMap<>();

        System.out.print(
                "Enter number of records: ");

        int recordCount = input.nextInt();
        input.nextLine();

        for(int recordIndex = 0; recordIndex < recordCount; recordIndex++) {

            System.out.print("Enter ID: ");
            int studentId = input.nextInt();
            input.nextLine();

            System.out.print("Enter Name: ");
            String studentName = input.nextLine();

            studentRecords.put(studentId, studentName);
        }

        System.out.print(
                "Enter ID to search: ");

        int lookupId = input.nextInt();

        System.out.println(
                "Student Name: " +
                        studentRecords.get(lookupId));
    }
}
