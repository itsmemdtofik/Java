/**
 * Create a class called counter contain a static data memeber to count the
 * number of counter object being created which display the number of object of
 * object created to data any point of time illustrate this.
 */

class counter {

    static int count = 0;

    static void showCount() {
        System.out.println("Count is = " + count);

    }

    void display() {
        count++;
        System.out.println("Count is = " + count);
    }
}

public class Counter_Data {
    public static void main(String[] args) {

        counter[] cn = new counter[5];
        for (int i = 0; i < 5; i++) {
            cn[i] = new counter();
            cn[i].display();
        }
        cn[4].showCount();

    }

}
