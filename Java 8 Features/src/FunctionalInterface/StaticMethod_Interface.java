package FunctionalInterface;

interface interface_1{
	public static void m1() {
		System.out.println("Static Method...");
	}
}

public class StaticMethod_Interface implements interface_1{
	
	public static void main(String[] args) {
		StaticMethod_Interface obj = new StaticMethod_Interface();
//		obj.m1(); // compile time error
//		StaticMethod_Interface.m1(); //compile time error
		interface_1.m1();
	}
	
}
