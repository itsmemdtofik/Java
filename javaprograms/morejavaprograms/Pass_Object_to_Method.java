class block {
    public int a;
    public int b;
    public int c;
    public int volume;

    block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    /**
     * Return true if ob defines same block Use object type of parameter
     */
    boolean sameBlock(block ob) {

        if ((ob.a == a) & (ob.b == b) & (ob.c == c))
            return true;
        else
            return false;
    }

    /** Return true if ob have same value */
    boolean sameValume(block ob) {
        if (ob.volume == volume)
            return true;
        else
            return false;
    }
}

public class Pass_Object_to_Method {
    public static void main(String[] args) {
        block b1 = new block(10, 2, 5);
        block b2 = new block(10, 2, 5);
        block b3 = new block(10, 20, 30);
        System.out.println("b1 have same dimension of b2 " + b1.sameBlock(b2));
        System.out.println("b1 have same dimension of b3 " + b1.sameBlock(b3));
        System.out.println("b1 have same volume as b3 " + b1.sameValume(b3));

    }

}
