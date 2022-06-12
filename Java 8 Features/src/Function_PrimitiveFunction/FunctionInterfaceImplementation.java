package Function_PrimitiveFunction;

import java.util.function.Function;

public class FunctionInterfaceImplementation {

	public static void main(String[] args) {
		
		Function<String,Integer> func = str -> str.length();
		System.out.println(func.apply("aravinth"));
		
		Function<Integer,Integer> func1 = str -> str * str;
		System.out.println(func1.apply(5));
		
		Function<String,String> func2 = str -> str.replaceAll(" ", "");
		System.out.println(func2.apply("arav inth"));
		
		Function<String,Integer> func3 = str -> str.length() - str.replaceAll(" ", "").length();
		System.out.println(func3.apply("arav inth"));
	}
	
}
