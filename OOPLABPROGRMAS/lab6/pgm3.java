/*
 * Create a abstract class figure with abstract method area of two integer diamension .
 * Create three more class Rectangle,Triangle,Square which extend figure and implement the area method.
 * show how the area can be computed dynamically during run time for Rectangle,Square,Triangle to achieve dynamic polymorphism.
 * Use the reference of figure class to call the 3 different area method*/


package lab6;
abstract class figure {
    double dimension1;
    double dimension2;

    abstract double area();
}
class Rectangle extends figure {
    Rectangle(double c, double d) {
        dimension1 = c;
        dimension2 = d;
    }

    @Override
    double area() {
        return dimension2 * dimension1;
    }
}
class Triangle extends figure {
    Triangle(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }
    @Override
    double area() {
        return dimension2 * dimension1;
    }
}
class Square extends figure {
    @Override
    double area() {
        return dimension1 * dimension2;
    }
}
public class pgm3 {
    public static void main(String[] args) {
        Rectangle rob = new Rectangle(4, 5);
        Triangle tob = new Triangle(4, 5);
        Square sob = new Square();
        figure f;
        f=rob;
        System.out.println("Area of Rectangle is = " + rob.area());
        System.out.println("Area of Triangle is = " + tob.area());
        System.out.println("Area of Square is = " + f.area());

    }
}
