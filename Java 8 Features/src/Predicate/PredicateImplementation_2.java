package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateImplementation_2 {

	public static void main(String[] args) {
		String arr[] = {"aravinth","","manivel",null," "};
		Predicate<String> p = s -> s != null && s.length() != 0 && !s.equals(" ");
		ArrayList<String> list = new ArrayList<>();
		
		for (String string : arr) {
			if(p.test(string)) {
				list.add(string);
			}
		}
		
		System.out.println("Result list : "+list);
	}
	
}
