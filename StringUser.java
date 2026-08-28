
import java.util.Scanner;

public class StringUser {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String s=sc.nextLine();
    
System.out.println( "length of the string is: " +s.length()); 
System.out.println("character at  0 index: " +s.charAt(0)); 
System.out.println("Characters from 6: "+s.substring(6)); 
System.out.println("All in upper case: "  +s.toUpperCase()); 
System.out.println("it has: " +s.contains("Hello")); 
System.out.println( "it starts with: " +s.startsWith("Hello")); 
System.out.println( "it ends with" +s.endsWith("Java")); 
System.out.println("the index is: " +s.indexOf("Java"));
}
}
