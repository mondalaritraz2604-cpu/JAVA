public class StatLargest {
    static void findlargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }

    public static void main(String[] args) {
        findlargest(10, 20, 15);
    }
}