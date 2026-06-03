public class DecompileDemo {

    public int subtract(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public static void main(String[] args) {

        DecompileDemo demoObject = new DecompileDemo();

        int subtractionResult = demoObject.subtract(15, 7);

        System.out.println("Subtraction Result = " + subtractionResult);
    }
}
