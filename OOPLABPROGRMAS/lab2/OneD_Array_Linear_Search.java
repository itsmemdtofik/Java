
/**Search an element in one d array using linear search */

import java.util.Scanner;

public class OneD_Array_Linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int num;
        int search;
        int a[];

        System.out.println("Enter the size of element ");
        num = sc.nextInt();
        a = new int[num];

        System.out.println("Enter the number of element ");
        for (i = 0; i < num; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter the element to be search ");
        search = sc.nextInt();

        for (i = 0; i < num; i++) {
            if (a[i] == search) {

                System.out.println("Item is presented in Array at location  " + (i + 1) + "  \t" + search);
                break;

            } else {
                
                System.out.println("Element is not present in Array " + search);
            }

        }

    }

}
