import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str1, str2; // Object of String Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one String\n");
        str1 = sc.nextLine();
        System.out.println("Enter the second string\n");
        str2 = sc.nextLine();
        int s1 = str1.length();
        int s2 = str2.length();
        if (str1.equals(str2)) {
            System.out.println("Entered String is palindrome=" + str1 + "==" + str2);
        } else {
            System.out.println("Entered string is not palindrome=" + str1 + "!=" + str2);
        }
    }

}