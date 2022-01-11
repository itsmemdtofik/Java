import java.util.*;

class Quick {
    int Partition(int a[], int start, int end) {
        int pivot = a[start];
        int pindex = start;
        int temp;
        for (int i = start; i < end - 1; i++) {
            if (a[i] <= pivot) {
                temp = a[pindex];
                a[pindex] = a[i];
                a[i] = temp;
                pindex++;
            }
        }
        temp = a[pindex];
        a[pindex] = a[end];
        a[end] = temp;
        return (pindex);
    }

    void Quick1(int a[], int start, int end) {
        if (start < end) {
            int temp = Partition(a, start, end);
            Quick1(a, start, temp - 1);
            Quick1(a, temp + 1, end);
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Item : ");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter number of Items : ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        Quick q = new Quick();
        System.out.println("After sorting : ");
        q.Quick1(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
