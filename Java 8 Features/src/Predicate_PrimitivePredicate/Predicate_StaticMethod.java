package Predicate_PrimitivePredicate;

import java.util.function.Predicate;

public class Predicate_StaticMethod {

	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("aravinth");
		System.out.println(p.test("ruban"));
		System.out.println(p.test("aravinth"));
	}
	
}
