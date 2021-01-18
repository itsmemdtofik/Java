
/**@Insert and Delete an Element from 1 D array by taking position as input */

import java.util.Scanner;

public class Insert_Delete_1D {
    public static void main(String[] args) {

        int size = 0;
        int i;
        int pos;
        int count = 0;
        int del;
        int ins;

        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[50];

        scanner.nextLine();

        System.out.println("Enter the Array Element : \n ");
        for (i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Enter the element to be inserted : \n ");
        ins = scanner.nextInt();

        System.out.println("At which position \n ");
        pos = scanner.nextInt();

        for (i = size; i > pos; i--) {
            arr[i] = arr[i - 1];

        }
        arr[pos] = ins;

        System.out.println("Inserted");

        System.out.println("New Array");
        for (i = 0; i < size + 1; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Element to be Inserted ");

        del = scanner.nextInt();
        for (i = 0; i < size; i++) {
            if (arr[i] == del) {
                for (int j = i; j < (size - 1); j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
                break;
            }

            if (count == 0) {
                System.out.println("Not found ");

            } else {
                System.out.println("Element Deleted");
            }
        }
        System.out.println("New Array ");
        for (i = 0; i < (size - 1); i++) {
            System.out.println(arr[i] + "");
        }

    }

}
