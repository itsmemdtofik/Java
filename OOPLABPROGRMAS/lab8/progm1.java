/* ###MULTI THREAD ###  CReate c class by extending Thread  class point a multiplication  table of number a no supplied as parameter.
 * Create author class Table which will instantiate 2 object of the above class to print multiplication of 5 x 7 */
package lab8;

class A implements Runnable {
    Thread t;
    int n;

    A(int a) {
        t = new Thread(this);
        n = a;
        t.start();

    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "\t*" + i + "\t=" + (n * i));
            }
            t.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n");
    }

    static class tables {
        tables() {
            A ob1 = new A(5);
            try {
                ob1.t.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Exiting...");
        }

        A ob2 = new A(7);
    }
}

class progm1 {
    public static void main(String[] args) {
        A.tables ob = new A.tables();
    }
}