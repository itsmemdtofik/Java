
/*Arrange the element in ascending and descending order using bubble sort */

import java.util.Scanner;

public class Ascending_Descending_Order {
    public static void main(String[] args) {

        int[] names = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = scanner.nextInt();
        names = new int[n];
        System.out.println("Enter the Element ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextInt();
        }
        System.out.println("---BEFORE SORTING IN ASCENDING ORDER---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        System.out.println("---BEFORE SORTING IN DESCENDING ORDER---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        /* For loop for Ascending order */

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp;
                if (names[j] > names[j + 1]) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        /* Print all the element in Ascending order */
        System.out.println("---AFTER SORTING IN ASCENDING ORDER---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        /* For loop for Descending order */
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp;
                if (names[j] < names[j + 1]) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        /* Print all the element in Descending order */
        System.out.println("---AFTER SORTING IN DESCENDING ORDER---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

    }

}
