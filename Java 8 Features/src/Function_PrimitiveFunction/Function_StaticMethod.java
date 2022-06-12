package Function_PrimitiveFunction;

import java.util.function.Function;

public class Function_StaticMethod {
	public static void main(String[] args) {
		Function<String,String> f = Function.identity();
		System.out.println(f.apply("aravinth")); // your input is your output
	}
}
