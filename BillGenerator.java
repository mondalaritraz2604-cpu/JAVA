
class BillGenerator {
    public void bill(int quantity, int price) {
        System.out.println("Bill Amount = " + (quantity * price));
    }

    public void bill(int quantity, double price) {
        System.out.println("Bill Amount = " + (quantity * price));
    }

    public static void main(String[] args) {
        BillGenerator b = new BillGenerator();
        b.bill(5, 100);
        b.bill(3, 49.50);
    }
}
