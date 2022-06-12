package Function_PrimitiveFunction;

import java.util.function.Function;

public class Function_DefaultMethods {

	public static void main(String[] args) {
		
		Function<String,String> f1 = str -> str.toUpperCase();
		Function<String,String> f2 = str -> str.substring(0,5);
		System.out.println(f1.andThen(f2).apply("aravinth")); // ARAVI
		System.out.println(f1.compose(f2).apply("aravinth")); // ARAVI
		
		Function<Integer,Integer> f3 = i -> i+i;
		Function<Integer,Integer> f4 = i -> i*i*i;
		System.out.println(f3.andThen(f4).apply(2)); // 64
		System.out.println(f3.compose(f4).apply(2)); // 16
	}
	
}
