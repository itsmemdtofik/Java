import java.io.*;

class Addition_Matrix_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int m3[][] = new int[3][3];
        int i, j;
        String m;
        System.out.println("Enter Elements of First Matrix of Order 3 x 3");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                m = k.readLine();
                m1[i][j] = Integer.parseInt(m);
            }
        }
        System.out.println("Enter Elements of Second Matrix of Order 3 x 3");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                m = k.readLine();
                m2[i][j] = Integer.parseInt(m);
            }
        }
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The First Matrix Entered is ");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The Second Matrix Entered is ");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The Addition of Matrix is ");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
