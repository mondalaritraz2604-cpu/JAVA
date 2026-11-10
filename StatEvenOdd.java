public class StatEvenOdd {
    static void checknumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        checknumber(4);
        checknumber(7);
    }
}