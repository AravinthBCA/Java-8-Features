package Function_PrimitiveFunction;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
	public static void main(String[] args) {
		// above line int is input type
		IntFunction<Integer> fun = i -> i*i; 
		System.out.println(fun.apply(5));
		//above line toint is return type
		ToIntFunction<String> fun1 = s -> s.length();
		System.out.println(fun1.applyAsInt("aravinth"));
	}
}
