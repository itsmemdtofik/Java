/* write a program to Runnable thread using constructor */

class MyTh implements Runnable {
    String threadName;

    MyTh(String name) {
        threadName = name;
    }

    /* Entry point of thread */

    public void run() {
        System.out.println("thread is starting" + threadName);
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(400);
                System.out.println("Thread Name " + threadName + "In" + i);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Thread is terminating " + threadName);
    }
}

class Thread_1 {
    public static void main(String[] args) {
        System.out.println("Starting main thread");

        MyTh th = new MyTh("child #1");
        Thread tt = new Thread(th);
        tt.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread is starting");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println("Main Thread is ending");
    }

}
