import java.util.*;

public class largestnumber {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Entar three numbers:");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if(a>b && a>c){
            System.out.println("the largest numbe is "+a);
     }
     else if (b>a && b>c){
         System.out.println("the largest numbe is "+b);
     }
     else{
         System.out.println("the largest numbe is "+c);
     }
 }
}
