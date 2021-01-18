
/** Find the addition of the two matrix and display the resulatant matrix */

import java.util.Scanner;

public class Addition_Two_Matrix {
    public static void main(String[] args) {

        int m, n;
        int i, j;

        Scanner sc = new Scanner(System.in);

        /** row and column matrix */

        System.out.println("Enter the number of row and column of matrix :");
        m = sc.nextInt();
        n = sc.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        /** row matrix */

        System.out.println("Enter the element of First matrix : ");

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                first[i][j] = sc.nextInt();
            }
        }
        /** column matrix */

        System.out.println("Enter the element of Second matrix : ");

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        /** Result */

        System.out.println("Resultant of matrix is");

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(sum[i][j] + "\t");
                System.out.println();
            }
        }

    }

}
