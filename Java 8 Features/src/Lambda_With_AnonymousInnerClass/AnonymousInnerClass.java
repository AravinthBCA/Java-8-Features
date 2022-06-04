package Lambda_With_AnonymousInnerClass;

interface inter{
	public void m1();
}

public class AnonymousInnerClass{
	int x = 1; // instance variable
	public void m2() {
		inter i = new inter() {
			int x = 2;  //instance variable because this is inside the anonymous inner class
			public void m1() {
				System.out.println("X : "+x);
				System.out.println("this.X : "+this.x);
				System.out.println("Outer.this.X : "+AnonymousInnerClass.this.x);

			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		AnonymousInnerClass obj = new AnonymousInnerClass();
		obj.m2();
	}

}
