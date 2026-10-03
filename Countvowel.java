import java.util.*;
public class Countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the string as input:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' ||
                ch == 'e' || ch == 'u' ||
                ch == 'A' || ch == 'I' || ch == 'O' ||
                ch == 'E' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Count of vowels = " + count);
    }
}