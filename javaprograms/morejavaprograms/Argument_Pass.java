class toTest {
    int a, b;

     toTest(int i, int j) {
        a = i;
        b = j;
    }

    /** Pass an object now ob.a and ob.b */
    void change(toTest ob) {
        ob.a =  ob.b;
        ob.b = -ob.b;
    }
}

public class Argument_Pass {
    public static void main(String[] args) {
        toTest ob = new toTest(15,20);
        System.out.println("Before calling " + ob.a + "," + ob.b);
        ob.change(ob);
        System.out.println("After calling " + ob.a + "," + ob.b);

    }

}
