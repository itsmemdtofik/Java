interface Series {
    int getNext(); // return next number in series

    void reset(); // restart same

    int setStart(int x);
}

class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int setStart(int x) {
        start = x;
        val = x;
        return val;

    }

    public int getNext() {
        val = val + 2;
        return val;
    }

    public void reset() {
        val = start;

    }
}

class ByThree implements Series {
    int start;
    int val;

    ByThree() {
        start = 0;
        val = 0;
    }

    public int setStart(int x) {
        start = x;
        val = x;
        return val;
    }

    public int getNext() {
        val = val + 3;
        return val;
    }

    public void reset() {
        start = val;
    }
}

public class Interface1 { /* By two Series */
    public static void main(String[] args) {

        ByTwos ob2 = new ByTwos();
        ByThree ob3 = new ByThree();
        System.out.println("ByTwos Series");
        System.out.println("Starting at=" + ob2.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next Value=" + ob2.getNext());
        System.out.println("------------------------------------");

        System.out.println("ByTwos Series");
        ob2.reset();
        System.out.println("Starting at=" + ob2.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next  value=" + ob2.getNext());
        System.out.println("------------------------------------");
        System.out.println("ByTwos Series");
        ob2.setStart(100);
        System.out.println("Starting at=" + ob2.val);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value=" + ob2.getNext());
        System.out.println("------------------------------------");
        /* Starting Three Series */
        System.out.println("ByThree Sries=");
        System.out.println("Starting at=" + ob3.val);
        for (int i = 1; i < 3; i++)
            System.out.println("Next value is=" + ob3.getNext());
        System.out.println("------------------------------------");
        /* reset method() */
        ob3.reset();
        System.out.println("Bythree series:");
        System.out.println("Starting at:" + ob3.val);
        for (int i = 1; i < 3; i++)
            System.out.println("The next value is=" + ob3.getNext());
        System.out.println("------------------------------------");
        /* setStart() */
        ob3.setStart(200);
        System.out.println("Bythree Series:");
        System.out.println("Starting at:" + ob3.val);
        for (int i = 1; i < 3; i++)
            System.out.println("The next value is=" + ob3.getNext());

    }

}
