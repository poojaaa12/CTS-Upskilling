public class PatternMatchingSwitch {

    static void checkType(Object inputObject) {

        switch(inputObject) {

            case Integer integerValue ->
                    System.out.println(
                            "Integer: " + integerValue);

            case String stringValue ->
                    System.out.println(
                            "String: " + stringValue);

            case Double doubleValue ->
                    System.out.println(
                            "Double: " + doubleValue);

            default ->
                    System.out.println(
                            "Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(100);

        checkType("Hello");

        checkType(99.5);
    }
}
