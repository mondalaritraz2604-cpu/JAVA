import java.util.*;
public class ArrayEvenOdd {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the size of array");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements in the array");
     for (int i = 0; i < n; i++) {
        a[i]=sc.nextInt(); 
    }
    int odd_count=0;
    int even_count=0;
    for (int i = 0; i < n; i++) {
        if (a[i]%2==0) {
            even_count++;
        }
        else{
            odd_count++;
        }
    }
    System.out.println("yttt");
    System.out.println(even_count);
    System.out.println(odd_count);
}
}
