import java.util.Scanner;

class upperlowercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int upper = 0, lower = 0, space = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (ch == ' ')
                space++;
        }
        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Spaces = " + space);
    }
}