import java.util.*;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> studentNames =
                Arrays.asList(
                        "John",
                        "David",
                        "Aami",
                        "Chris");

        studentNames.sort(Comparator.naturalOrder());

        System.out.println(studentNames);
    }
}
