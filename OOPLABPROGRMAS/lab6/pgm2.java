/* Define a classes with follwing overloaded method

*1.Max(which find maximum among three integer and returns the maximum inetger).
*2. Max(which find maximum among three floating pointer number and returns the maximum inetger).
*3.Max(which find maximum in the array and returns the maximum ).
*4 Max(which find maximum in the matrix and returns the result ).

  PLACE THIS IN A PACKAGE CALLED P1 .LET THIS PACKAGE BE PRESENT IN A FOLDER "MY PACKAGE" WHIXH IS IN YOUR DIREXTORY
  WRITE A MAIN METHOD TO BE USED IN METHOD OF MAX CLASS IN PACKAGE P1
*/


package lab6;
import java.util.Scanner;
public class pgm2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        lab6.Maximum obj = new lab6.Maximum();
        System.out.println("Enter three Integer : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Maximum is = " + obj.max(a, b, c));
        System.out.println("------------------------------------------------------");
        System.out.println("Enter the size of element : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maximum array element is = " + obj.max(arr));
        System.out.println("------------------------------------------------------\n\n");
        System.out.println("Enter the size of rows and column array : ");
        int q=scanner.nextInt();
        int m = scanner.nextInt();
        int[][] brr = new int[m][n];
        System.out.println("Enter the two array's element : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                brr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Maximum is = " + obj.max(brr));
    }
}
