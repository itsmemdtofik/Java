/* Write a generic method to exchange the position of different element in an array */
package lab9;

import java.util.*;

class exchange<T> {
    T[] arr;

    public exchange(T[] a) {
        this.arr = a;
    }

    public void exchange(int m, int n) {
        T temp;
        temp = arr[m - 1];
        arr[m - 1] = arr[n - 1];
        arr[n - 1] = temp;


    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println("\n");
    }
}

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = scanner.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Enter the String of an array :");
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        System.out.println("Enter Position to exchange :");
        int m = scanner.nextInt();
        int o = scanner.nextInt();
        exchange<Integer> cob = new exchange<Integer>(arr);
        cob.exchange(m, o);
        cob.display();
        exchange<String> sob = new exchange<String>(str);
        sob.exchange(m, o);
        sob.display();
    }
}