package Predicate;

import java.util.function.Predicate;

public class PredicateImplementation_1 {

	public static void main(String[] args) {
		String str[] = {"aravinth","ruban","manivale","apple","aaa"};
		Predicate<String> startsWithA = s -> s.charAt(0) == 'a';
		for(String temp : str) {
			if(startsWithA.test(temp)) {
				System.out.println(temp);
			}
		}
	}
	
}
