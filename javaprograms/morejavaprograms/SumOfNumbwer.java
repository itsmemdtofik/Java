import java.util.Scanner;

public class SumOfNumbwer {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
        }
        System.out.println("The sum of number is ");
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println("The total number is " + sum);
        }
    }

}
