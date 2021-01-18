import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number ");
        int b = scanner.nextInt();
        System.out.println("Before Swapping A=" + a + "\tB=" + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping the nunber is A=" + a + "\tB=" + b);

    }

}
