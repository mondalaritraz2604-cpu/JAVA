public class hierarchialInheritance {

    void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}

class Dog extends hierarchialInheritance {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends hierarchialInheritance {

    void meow() {
        System.out.println("Cat is meowing");
    }
}
