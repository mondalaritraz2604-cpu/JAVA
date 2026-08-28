import java.util.*;
public class ArrayGeatest {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("Enter the elements in the array");
     for (int i = 0; i < n; i++) {
        a[i]=sc.nextInt(); 
}
int largest=a[0];
int smallest=a[0];
for(int i=0;i<n;i++){
    if(a[i]>largest){
        largest=a[i];
    }
    if(a[i]<smallest){
        smallest=a[i];
    }
}

System.out.println("the largest element is " +largest);
System.out.println("the smallest element is " +smallest);
}
}
