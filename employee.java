public class employee {
    String name;
    int age;
    String role;
    void display(){
    
        System.out.println("Name :" +name);
        System.out.println("Age"+age);
        System.out.println("Role: "+role);
    }
    public static void main(String[] args) {
        employee e1=new employee();
        employee e2=new employee();
        e1.name="Aritra";
        e1.age=20;
        e1.role="worker";

        e2.name="Ashish";
        e2.age=20;
        e2.role="worker";

        e1.display();
        e2.display();


    }
}
