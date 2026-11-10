public class inheritanceAnimal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends inheritanceAnimal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}