public class TypeCasting {
    public static void main(String[] args) {

        double decimalValue = 45.78;
        int integerValue = (int)decimalValue;

        System.out.println("Double to Int = " + integerValue);

        int wholeNumber = 50;
        double convertedValue = (double)wholeNumber;

        System.out.println("Int to Double = " + convertedValue);
    }
}
