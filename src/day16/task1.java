package day16;

import java.security.PrivateKey;
import java.util.EventListener;

public class task1 implements Runnable {
	private Get choice;

	public task1(String astring){
		switch (astring){
			case "Even": this.choice = Get.Even; break;
			case "Odd": this.choice = Get.Odd; break;
		}
	}



	public static void main(String[] args) {
		//task 1 print even number from a thread and odd number from another thread.
		Runnable even = new task1("Even");
		Thread evenThread = new Thread(even);

		Runnable odd = new task1("Odd") ;
		Thread oddThread = new Thread(odd);

		oddThread.start();
		evenThread.start();

	}

	public void run() {
		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0 && this.choice == Get.Odd) {
				System.out.println("Odd Number from evenThread: " + i);
			}

			if (i % 2 == 0 && this.choice == Get.Even) {
				System.out.println("even Number from evenThread: " + i);
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	enum Get {
		Odd,
		Even;
	}
}
