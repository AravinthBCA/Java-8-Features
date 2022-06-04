package Lambda_With_AnonymousInnerClass;

public class AnonymousInnerClass_Runnable {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("Child Thread...");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <5; i++) {
			System.out.println("Main Thread...");
		}
	}
	
}
