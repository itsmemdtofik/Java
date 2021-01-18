import java.util.Scanner;

class Factorial {

    int factR(int n) {

        if (n == 0)
            return 1;
        else
            return n * factR(n - 1);
    }

}

public class Recursion_Factorial {
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer number = ");
        int n = scanner.nextInt();
        System.out.println("The factorial of given number is = " + fc.factR(n));

    }

}
