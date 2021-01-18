/** use notify() and wait() to create ticking clock */

class TickTock {
	String state;

	synchronized void tick(boolean running) {
		if (!running) { /* contain the state of the clock */
			state = "ticked"; /* Stop the clock */
			notify(); /* notify for waiting any thread */
			return;
		}
		System.out.println("Tick");
		state = "ticked"; /* set the current state to ticked */
		notify(); /* let tock() run */
		try {
			while (!state.equals("tocked")) {
				wait(); /* wait for tock to complete */
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted Thread");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) {
			state = "tocked";
			notify();
			return;
		}
		System.out.println("Tock");
		state = "tocked";
		notify();
		try {
			while (!state.equals("ticked")) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted thread");

		}
	}
}

class MyThread implements Runnable {
	Thread thread;
	TickTock ttob;

	MyThread(String name, TickTock tt) {
		thread = new Thread(this, name);
		ttob = tt;
	}

	public void run() {
		if (thread.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) {
				ttob.tick(true);
				ttob.tick(false);
			}
		}
	}
}

public class wait_notify_all {
	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThread mt1 = new MyThread("Tick", tt);
		MyThread mt2 = new MyThread("Tock", tt);
		try {
			mt1.thread.join();
			mt2.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted thread ");
		}
	}

}
