public class OperatorPrecedence {
    public static void main(String[] args) {

        int defaultResult = 10 + 5 * 2;
        int groupedResult = (10 + 5) * 2;

        System.out.println(defaultResult);
        System.out.println(groupedResult);
    }
}
