
/** Write a method fact to find the factorial of a given number
 * Using this method compute NCR in the main method
 */

import java.util.Scanner;

public class Factorial_Number {

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n=sc.nextInt();
        int d=fact(n);
        System.out.println("Factorial of given number is = "+d);

        /*Now calculate the NCR */
        System.out.println("Enter the value that it should be greater than n");
        int r=sc.nextInt();
        int y=n-r;
        int z=fact(y);
        int m=fact(r);
        int k=d/(m*z);

        System.out.println("The value of NCR of "+n+","+r+","+"is  =   "+k);


        

    }

}
