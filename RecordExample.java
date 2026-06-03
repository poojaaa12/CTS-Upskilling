import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordExample {

    public static void main(String[] args) {

        List<Person> personList =
                List.of(
                        new Person("Alice",21),
                        new Person("John",17),
                        new Person("David",25)
                );

        List<Person> adultPeople =
                personList.stream()
                        .filter(person -> person.age() >= 18)
                        .collect(Collectors.toList());

        adultPeople.forEach(System.out::println);
    }
}
