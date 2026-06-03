import java.util.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numberList =
                Arrays.asList(
                        1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumberList =
                numberList.stream()
                        .filter(number -> number % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(evenNumberList);
    }
}
