package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyRunnable implements Runnable {
	private boolean printEven;
	static CyclicBarrier barrier = new CyclicBarrier(2);
	public MyRunnable(boolean b) {
	this.printEven = b;
	}
	@Override
	public void run() {
	try {
	for (int i = 1; i < 21; i++) {
	if (printEven && i % 2 == 0)
	System.out.println("Thread even: " + i);
	else if (!printEven && i % 2 == 1)
	System.out.println("Thread Odd: " + i);
	barrier.await();
	}
	} 
	catch (BrokenBarrierException e) {
	} 
	catch (InterruptedException e) {
	}
	}
}