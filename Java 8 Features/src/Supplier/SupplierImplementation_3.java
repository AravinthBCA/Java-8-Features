package Supplier;

import java.util.Arrays;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierImplementation_3 {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Integer> sup1 = () -> (int)(Math.random()*10);
			Supplier<Character> sup2 = () -> alpha.charAt((int) (Math.random()*29));
			String pws = "";
			for (int i = 1; i <=8; i++) {
				if(i%2==1) {
					pws += sup2.get();
				}
				else {
					pws += sup1.get();
				}
			}
			return pws;
		};
		System.out.println(sup.get());
//		System.out.println(sup.get());
//		System.out.println(sup.get());
	}
	
}
