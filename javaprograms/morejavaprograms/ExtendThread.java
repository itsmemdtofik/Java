class mThread extends Thread {
    mThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Starting The Thread name = " + getName());
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                System.out.println("Interrupted " + getName() + "," + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted " + getName());
        }
        System.out.println("Terminating Thread" + getName());
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        mThread mt = new mThread("child#1");
        mt.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("-------");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }

        }
        System.out.println("Main Thread Ending");
    }

}
