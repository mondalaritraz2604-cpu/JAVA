public class Newcar {
    String brandName;
    int mileage;

    Newcar(String brandName, int mileage) {
        this.brandName = brandName;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Mileage: " + mileage);
    }

    public static void main(String[] args) {

        Newcar c1 = new Newcar("Toyota", 20);
        Newcar c2 = new Newcar("Honda", 18);

        c1.display();
        c2.display();
    }
}