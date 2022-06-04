package Lambda_WIth_Threads;

import java.util.Iterator;

class MyRunnbale implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Runnable Thread.....");
			} catch (InterruptedException e) {
				System.out.println("Exception : "+e.getMessage());
			}
		}
	}
	
}

public class Normal_Runnable_Implementation {
	
	public static void main(String[] args) {
		Runnable r = new MyRunnbale();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
				System.out.println("Main Thread.....");
			} catch (InterruptedException e) {
				System.out.println("Exception : "+e.getMessage());
			}
		}
	}

}
