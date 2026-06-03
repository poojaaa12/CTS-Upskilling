// File: InspectBytecode.java

public class InspectBytecode {

    // Simple method to demonstrate bytecode
    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public static void main(String[] args) {

        InspectBytecode bytecodeDemo = new InspectBytecode();

        int multiplicationResult = bytecodeDemo.multiply(5, 6);

        System.out.println("Multiplication Result = " + multiplicationResult);
    }
}
