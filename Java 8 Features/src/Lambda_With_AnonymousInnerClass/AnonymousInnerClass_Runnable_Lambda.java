package Lambda_With_AnonymousInnerClass;

public class AnonymousInnerClass_Runnable_Lambda {

	public static void main(String[] args) {
		Runnable r = () -> {for(int i = 0; i <5; i++) {
								System.out.println("Child Thread...");
							}	};
		
		Thread t1 = new Thread(() -> {for(int i = 0; i <5; i++) {
										System.out.println("Child Thread2...");
								     }	} 
							  );

		Thread t = new Thread(r);
		t.start();
		t1.start();
		for (int i = 0; i <5; i++) {
			System.out.println("Main Thread...");
		}
	}
	
}
