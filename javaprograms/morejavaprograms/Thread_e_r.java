/* Write a program to create a thread using extends and runnnable thread*/

class W extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread A is Starting " + i);
                Thread.sleep(3000);

            }
            System.out.println("Thread A is terminating");
        } catch (InterruptedException e) {
            System.out.println("Interruoted Threading");
        }
    }

}

class X implements Runnable {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread B is Starting " + i);
                Thread.sleep(4000);

            }
            System.out.println("Thread B is terminating");
        } catch (InterruptedException e) {
            System.out.println("Interrupted Thread");
        }
    }
}

public class Thread_e_r {
    public static void main(String[] args) {
        W Ta = new W();
        Ta.start();
        X Tb = new X();
        Thread tt = new Thread(Tb);
        tt.start();
    }

}
