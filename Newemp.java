public class Newemp{
    String name;
    int age;
    String role;
    Newemp(String name, int age, String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }
    void display(){
        System.out.println("Name :" +name);
        System.out.println("Age"+age);
        System.out.println("Role: "+role);
    }

public static void main(String[] args) {
   Newemp e1=new Newemp("Aritra",20,"worker");
   Newemp e2=new Newemp("Ashish",20,"HR");
   e1.display();
   e2.display();
}
}
