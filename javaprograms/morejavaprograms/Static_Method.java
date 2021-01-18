/** WRITE A PROGRAM TO USE OF STATIC METHOD */

class staticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

public class Static_Method {
    public static void main(String[] args) {
        staticDemo std = new staticDemo();
        staticDemo std1 = new staticDemo();

        std.x = 10;
        std1.x = 30;

        System.out.println("Ofcourse std.x and std1.x are indepenedent");
        System.out.println("std.x is = " + std.x + "\nstd1.x value is = " + std1.x);

        System.out.println();

        /** Each object shares one copy of static variable */
        System.out.println("The static variable y is shared ");

        /** Set static demo set to 19 */
        staticDemo.y = 19;
        System.out.println("std.sum() " + std.sum());
        System.out.println("std1.sum() " + std1.sum());

        /** Set static demo set to 100 */
        staticDemo.y = 100;
        System.out.println("std.sum() " + std.sum());
        System.out.println("std1.sum() " + std1.sum());

    }

}
