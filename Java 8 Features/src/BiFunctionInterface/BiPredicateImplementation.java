package BiFunctionInterface;

import java.util.function.BiPredicate;

public class BiPredicateImplementation {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bi =  (a,b) -> (a+b) % 2 == 0;
		System.out.println(bi.test(5, 5));
		System.out.println(bi.test(5, 6));
	}
}
