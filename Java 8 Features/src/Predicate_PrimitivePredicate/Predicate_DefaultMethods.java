package Predicate_PrimitivePredicate;

import java.util.function.Predicate;

public class Predicate_DefaultMethods {
	
	public static void m1(Predicate<Integer> p,int arr[]) {
		for(int x : arr) {
			if(p.test(x)) {
				System.out.println(x);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,10,20,3,5,40};
		
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println(p1.negate().test(10));
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.or(p2).test(10));
		
		System.out.println("The number Greater than 10 are : ");
		m1(p1,arr);
		
		System.out.println("The even numbers are : ");
		m1(p2,arr);
		
		System.out.println("The number Not Greater than 10 are : ");
		m1(p1.negate(),arr);
		
		System.out.println("The number Greater than 10 and even numbers are : ");
		m1(p1.and(p2),arr);
		
		System.out.println("The number Greater than 10 or even numbers are : ");
		m1(p1.or(p2),arr);
	}
	
}
