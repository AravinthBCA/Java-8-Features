package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateInterfaceImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		Predicate<Collection> p1 = i -> i.isEmpty();
		System.out.println(p1.test(list));
		
		Predicate<Integer> p2 = i -> i > 10;
		System.out.println(p2.test(100));
		System.out.println(p2.test(10));
		System.out.println(p2.test(1));
		
		Predicate<String> p3 = s -> s.length() > 10;
		System.out.println(p3.test("asdf"));
		
	}
	
}
