/* Write  a program to demonstrate thread*/
package lab8;

import java.lang.Thread;

public class progm4 extends Thread {
    public void run() {
        System.out.println("Returning thread name is :" + Thread.currentThread().getName());
        System.out.println("Returning thread and printing is = " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        progm4 m1 = new progm4();
        progm4 m2 = new progm4();
        m1.getPriority(Thread.MIN_PRIORITY);
        m2.getPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }

    private void getPriority(int minPriority) {
    }
}
