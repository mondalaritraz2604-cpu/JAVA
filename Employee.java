class Employee {
    void displayCompany() {
        System.out.println("Company: ABC Technologies");
    }
}

class Teacher extends Employee {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class Test {
    void display() {
        Teacher t = new Teacher();
        Developer d = new Developer();

        t.displayCompany();
        t.teach();

        d.displayCompany();
        d.writeCode();
    }
}