
/**Define a class to represent complex number called complex .
 * To initial value to the complex number.
 * To Display the complex number in a+ib form.
 * To Add 2 complex number.
 * To subtract 2 complex number
*/

import java.util.Scanner;

public class Complex_Number {

    double real;
    double imag;

    public Complex_Number(double r, double img) {

        this.real = r;
        this.imag = img;
    }
    /* Add() for two complex number */
    /* creating a temporary complex number to hold the sum of two numbers */

    public static Complex_Number add(Complex_Number n1, Complex_Number n2) {

        Complex_Number temp = new Complex_Number(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return temp;
    }

    /* Substracting tow number here */
    /* creating a temporary complex number to hold the sum of two numbers */

    public static Complex_Number sub(Complex_Number n1, Complex_Number n2) {

        Complex_Number sb = new Complex_Number(0.0, 0.0);
        sb.real = n1.real - sb.real;
        sb.imag = n1.imag - n2.imag;
        return sb;

    }

    public static void main(String[] args) {

        Complex_Number c1 = new Complex_Number(5.5, 4);
        Complex_Number c2 = new Complex_Number(1.2, 3.5);

        /* Displaying add of two complex number */
        Complex_Number temp = add(c1, c2);
        System.out.printf("Sum is = " + temp.real + " + " + temp.imag + "i\n");

        /* Displaying the substracting of two complex number */

        Complex_Number sb = sub(c1, c2);
        System.out.printf("Sub is = " + sb.real + " - " + sb.imag + "i\n");

    }

}
