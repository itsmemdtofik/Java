import java.util.*;

public class PyramidsAndPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = scanner.nextInt();
        System.out.println("Pyramids is : ");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------Invertes Pyramids------------\n");
        System.out.println("Enter number of rows : ");
        int rows1 = scanner.nextInt();
        for (int i = rows1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("------------Full pyramid-------------\n");
        System.out.println("Enter the size of number : ");
        int rows2 = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= rows2; i++, k = 0) {
            for (int space = 1; space <= rows2 - i; space++) {
                System.out.print(" ");
            }
            while (k != (2 * i - 1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("------------Inverted Full Pyramid-------------\n");
        System.out.println("Enter the size of number : ");
        int rows3 = scanner.nextInt();
        for (int i = rows3; i >= 1; i--) {
            for (int space1 = 1; space1 <= rows3 - i; space1++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (i - 1); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
