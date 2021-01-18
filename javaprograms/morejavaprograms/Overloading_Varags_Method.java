
/** Overloading varags in java chapter A closer look at nethood */

class Overloading_Varags_Method {
    static void vaTest(int... v) {
        System.out.println("Variable test of int is :" + "Number of args " + v.length);
        System.out.println("Contents");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Args is " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(Boolean... v) {
        System.out.println("Variable test of Boolean is :" + "Number of args " + v.length);
        System.out.println("Contents");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Args is " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("Variable test of string and int is :" + "Number of args " + msg + v.length);
        System.out.println("Contents");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Args is " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testing :", 10, 20);
        vaTest(true, false, false);
    }

}
