package Predicate_PrimitivePredicate;

import java.util.function.*;

public class PrimitivePredicate {
	public static void main(String[] args) {
		IntPredicate obj = i -> i%2==0;
		Integer i1 = 6;
		for(int i=0; i<5; i++) {
			if(obj.test(i1)) {
				System.out.println(i);
			}
		}
	}
}
