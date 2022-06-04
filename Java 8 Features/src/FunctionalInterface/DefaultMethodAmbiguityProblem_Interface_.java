package FunctionalInterface;

interface interf_1{
	default void m1() {
		System.out.println("interf_1 Default Method...");
	}
}

interface interf_2{
	default void m1() {
		System.out.println("interf_2 Default Method...");
	}
}

public class DefaultMethodAmbiguityProblem_Interface_ implements interf_1,interf_2{

	@Override
	public void m1() {  // without this method you got ambiguity problem compile time error
// why we mention interface name means without name same problem will arise again because both
//	interface are super 
		interf_1.super.m1(); 
		interf_2.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethodAmbiguityProblem_Interface_ obj = new DefaultMethodAmbiguityProblem_Interface_();
		obj.m1();
	}
}