@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
}

public class LambdaMath {

    public static void main(String[] args) {

        // Lambda expression for Addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for Multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression for Power
        MathOperation power = (a, b) -> Math.pow(a, b);

        double x = 4;
        double y = 3;

        System.out.println("Addition: " + addition.operate(x, y));
        System.out.println("Multiplication: " + multiplication.operate(x, y));
        System.out.println("Power: " + power.operate(x, y));
    }
}