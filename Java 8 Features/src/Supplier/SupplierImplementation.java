package Supplier;

import java.util.Arrays;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierImplementation {

	public static void main(String[] args) {
		
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get());
		
		Supplier<String[]> sup1 = () -> {
			String arr[] = {"aravinth","ruban"};
			return arr;
		};
		System.out.println(Arrays.toString(sup1.get()));
	}
	
}
