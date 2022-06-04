package FunctionalInterface;

interface interf{
	default void m1() {
		System.out.println("Default Method...");
	}
}

public class DefaultMethod_Interface implements interf{

	@Override
	public void m1() { // decrease the access level private -> default -> protected -> public
		System.out.println("MyDefault Method");
	}
	
	public static void main(String[] args) {
		DefaultMethod_Interface obj = new DefaultMethod_Interface();
		obj.m1();
	}
	
}
