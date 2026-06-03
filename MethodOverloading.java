public class MethodOverloading {

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(10, 20, 30));
    }
}
