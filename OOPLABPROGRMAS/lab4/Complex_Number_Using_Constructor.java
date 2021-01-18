
/**
 * Consider already complex number class .Provide a default constructor and
 * parameterized constructor to this class.Also provide a display method
 * illustrate all the constructor as well as the display method by defining
 * complex object.
 */
import java.util.Scanner;

class Complex {

    int real;
    int img;

    Complex(int a, int b) {
        this.real = a;
        this.img = b;
    }

    public void display() {
        System.out.println(this.real + "" + this.img);
    }

    public Complex Add(Complex c) {
        int real_new = Math.abs(this.real + this.img);
        int img_new = Math.abs(this.real + this.img);
        Complex com = new Complex(real_new, img_new);
        return com;
    }

    public Complex Sub(Complex c) {
        int real_new = Math.abs(this.real - this.img);
        int img_new = Math.abs(this.real - this.img);
        Complex com = new Complex(real_new, img_new);
        return com;

    }
}

public class Complex_Number_Using_Constructor {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        System.out.println("Enter the two number = ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        Complex com1 = new Complex(a, b);
        com1.display();

        System.out.println("Enter the two number = ");
        c = scanner.nextInt();
        d = scanner.nextInt();

        Complex com2 = new Complex(c, d);
        com2.display();

        Complex c_Add = new Complex(0, 0);
        c_Add = com1.Add(com2);
        c_Add.display();

        Complex c_sub = new Complex(0, 0);
        c_sub = com1.Sub(com2);
        c_sub.display();

    }

}
