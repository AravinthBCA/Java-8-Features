package BiFunctionInterface;

import java.util.function.BiFunction;

public class BiFunctionImplementation {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bi = (a,b) -> a+b;
		System.out.println(bi.apply(5, 5));
	}
}
