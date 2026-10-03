public class cars {
    String brandName;
    int mileage;

    void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Mileage: " + mileage);
    }
    public static void main(String[] args) {

        cars c1 = new cars();
        cars c2 = new cars();

        c1.brandName = "Toyota";
        c1.mileage = 20;

        c2.brandName = "Honda";
        c2.mileage = 18;

        c1.display();
        c2.display();
    }
}