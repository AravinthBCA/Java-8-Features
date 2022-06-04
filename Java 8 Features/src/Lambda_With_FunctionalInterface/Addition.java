package Lambda_With_FunctionalInterface;

@FunctionalInterface
interface inter{
	public int add(int a,int b);
}

public class Addition {

	public static void main(String[] args) {
		inter i = (a,b) -> a+b;
		System.out.println(i.add(15, 5));
	}
	
}
