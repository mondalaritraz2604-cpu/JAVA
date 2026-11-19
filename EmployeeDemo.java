abstract class Employee {
    abstract int getSalary();

    void displayCompany() {
        System.out.println("ABC Technologies");
    }
}

class FullTimeEmployee extends Employee {
    int getSalary() {
        return 40000;
    }
}

class PartTimeEmployee extends Employee {
    int getSalary() {
        return 15000;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();

        f.displayCompany();
        System.out.println("Full Time Salary: " + f.getSalary());

        p.displayCompany();
        System.out.println("Part Time Salary: " + p.getSalary());
    }
}