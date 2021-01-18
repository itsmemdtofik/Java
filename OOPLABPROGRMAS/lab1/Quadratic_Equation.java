
/** Compute all the roor of quadratic equation using switch case */

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int e;
        double r1;
        double r2;

        /* We are taking three input from the keyboard */
        System.out.println("Enter the three number : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.nextLine();

        float d = b * b - 4 * a * c;

        /* Checking condition */
        if (d > 0) {
            e = 1;
        } else if (d < 0) {
            e = -1;
        } else {
            e = 0;
        }

        /** Now swicth case start */
        switch (e) {
            case 1:
                r1 = (-b + Math.sqrt(d)) / (2.0 * a);
                r2 = (-b - Math.sqrt(d)) / (2.0 * a);
                System.out.println("Root one is : " + r1);
                System.out.println("Root two is : " + r2);
                break;
            case -1:
                r1 = -b / (2.0 * a);
                r2 = (Math.sqrt(-1 * d)) / (2.0 * a);
                System.out.println("Roots are imaginary : ");
                System.out.println("Root one is : " + r1 + "\t i" + r2);
                System.out.println("Root two is : " + r1 + "\t-i" + r2);
                break;
            case 0:
                r1 = (-b) / (2.0 * a);
                System.out.println("Root is = " + r1);
                break;

        }

    }

}
