
/**
 * Write a method largest to find the maximum of three number.Also write a main program to read three number
 * and find the largest number among them using method
 */

import java.util.Scanner;

class Maximum_Three_Number {

    public static int largest(int a, int b, int c) {

        if (a > b) {

            if (a > c) {

                return a;

            } else {

                return c;
            }
        }
        if (b > c) {

            return b;

        } else {

            return c;
        }

    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer number : = ");
        int a = sc.nextInt();
        System.out.println("Enter the Second integer number : = ");
        int b = sc.nextInt();
        System.out.println("Enter the third integer number : = ");
        int c = sc.nextInt();
        sc.nextLine();
        int d = largest(a, b, c);
        System.out.println("Largest is = " + d);

    }
}