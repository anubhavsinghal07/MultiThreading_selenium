package seleniumMultipleThreading;

import java.time.LocalDateTime;

public class RunMethod {

	// main method to create the thread and run multiple threads
	public static void main(String[] args) {

		Thread t1 = new SeleniumMultiThreadingSample("Thread driver 1", "Chrome");
		Thread t2 = new SeleniumMultiThreadingSample("Thread driver 2", "Firefox");
		Thread t3 = new SeleniumMultiThreadingSample("Thread driver 3", "IE");
		// t2.currentThread().setPriority(1);
		System.out.println("Starting Threads" + " " + LocalDateTime.now());
		t1.start();
		t2.start();
		t3.start();

		// Thread.getAllStackTraces().keySet().forEach((t) ->
		// System.out.println(t.getName() + "\nIs Daemon " + t.isDaemon() + "\nIs Alive" + t.isAlive()));
	}
}
