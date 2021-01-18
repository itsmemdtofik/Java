
/* Create a thread to declare refrence using implments runnable interface */
public class Thread_ref {
    public static void main(String[] args) {

        MyTi nn = new MyTi("child #1");
        Thread td = new Thread(nn);
        td.start();
        try {
            System.out.println("Main thread is getting starting");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupte");

        }
        System.out.println("Main Thread is terminating");

    }

}

class MyTi implements Runnable {
    Thread thrd;

    MyTi(String name) {
        thrd = new Thread(this, name);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400);
                System.out.println("Thread name " + thrd.getName() + "And count = " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread are interrupted");
        }
        System.out.println("Thread is ending");
    }
}
