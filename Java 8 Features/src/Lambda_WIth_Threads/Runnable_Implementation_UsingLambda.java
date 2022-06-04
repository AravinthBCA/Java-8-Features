package Lambda_WIth_Threads;

public class Runnable_Implementation_UsingLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread...");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
		}
	}

}
