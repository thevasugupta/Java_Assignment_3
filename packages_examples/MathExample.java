package packages_examples;

public class MathExample {
    public static void main(String[] args) {
        double randomVal = Math.random();
        System.out.println("Random Value: "+randomVal);

        int number = -45;
        int absoluteVal = Math.abs(number);
        System.out.println("Absolute Value: "+absoluteVal);

        double base = 2;
        double exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
