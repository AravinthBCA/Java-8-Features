package Lambda_With_AnonymousInnerClass;

interface interf{
	public void m1();
}

public class AnonymousInnerClass_Lambda{
	int x = 1; // instance variable
	int y = 3; 
	public void m2() {
		int x = 2; //local variable because this is inside the method
		interf i = () -> {
			int x1 = 2; //local variable because this is inside the method
			System.out.println("X1 : "+x1);
			System.out.println("Y : "+y);
			System.out.println("this.X : "+this.x);
			this.x=5;
//			x=5;  // compiler time error because when you access localvariable inside the 
//			lambda expression is must be final or effectively final so can't change the value
//whenever access the localvariables in the lambda expression the compiler convert that 
//variable into final so can't change the value inside or outside the lambda expression
			System.out.println("X : "+x);
			
		};
//		x=5; //compiler time error you want resolve means comment the line number 21
		i.m1();
	}

	public static void main(String[] args) {
		AnonymousInnerClass_Lambda obj = new AnonymousInnerClass_Lambda();
		obj.m2();
	}

}
