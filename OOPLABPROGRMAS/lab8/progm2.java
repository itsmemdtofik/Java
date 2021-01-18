/* Write and execute a java program to create and intialized a matrix of integer.
 * Create n thread by implementing Runnable interface where n is equal to the nnumber of rwos in the matrix.
 * Each of these thread compute a distinct row sum by coocking into the practical sums given by thread.*/


package lab8;

import java.util.Scanner;

class matrixAdd implements Runnable {
    int arr[];
    int sum;
    Thread t;

    matrixAdd(int a[]) {
        arr = a;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
    }
}

public class progm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        int mSum = 0;
        System.out.println("Enter the size of array :m X n ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        matrixAdd mobj[] = new matrixAdd[matrix.length];
        for (int x = 0; x < matrix.length; x++)
            mobj[x] = new matrixAdd(matrix[x]);
            try {
                for (int i = 0; i < matrix.length; i++)
                    mobj[i].t.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            for (int i = 0; i < matrix.length; i++) {
                mSum =mSum+ mobj[i].sum;
            }
            System.out.println("Sum is = " + mSum);
    }
}
