import java.util.Scanner;

class NoOfDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :\n");
        int num = scanner.nextInt();
        scanner.nextLine();
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The number of Digits is=" + count);
    }
}