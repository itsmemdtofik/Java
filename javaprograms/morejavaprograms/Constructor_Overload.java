class Myclass {

    Myclass() {
        System.out.println("Constructor Overloading");
    }

    Myclass(int i) {
        System.out.println("Integer value is =" + i);
    }

    Myclass(double d) {
        System.out.println("Double value is =" + d);
    }

    Myclass(float f) {
        System.out.println("Float value is =" + f);

    }

    Myclass(String s) {
        System.out.println("String vlaue is =" + s);
    }

    Myclass(int a, double b, float c, String d) {
        System.out.println("Integer value is =" + a + "\nDouble value is =" + b + "\nFloat vlaue is =" + c
                + "\nString value is =" + d);

    }
}

public class Constructor_Overload {
    public static void main(String[] args) {
        Myclass mc = new Myclass();
        Myclass mc1 = new Myclass(12);
        Myclass mc2 = new Myclass(23.00);
        Myclass mc3 = new Myclass(23.5f);
        Myclass mc4 = new Myclass("Mohammad Tofik");
        Myclass mc5 = new Myclass(21, 45.00, 34f, "java");

        /** Displaying values */

    }

}
