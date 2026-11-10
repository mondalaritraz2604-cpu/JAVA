public class StatCal {
    static void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    static void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    static void divide(int a, int b) {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        add(10, 5);
        subtract(10, 5);
        multiply(10, 5);
        divide(10, 5);
    }
}