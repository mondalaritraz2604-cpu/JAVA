class Person {
    void displayName() {
        System.out.println("Name: Aritra");
    }
}

class Student extends Person {
    void displayMarks() {
        System.out.println("Marks: 90");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.displayName();
        s.displayMarks();
    }
}