package Supplier;

import java.util.Arrays;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierImplementation_1 {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			String arr[] = {"manivel","aravinth","ruban","sankar"};
			int index = (int) (Math.random() * 3); // it return only 0<= X <1
			return arr[index];
		};
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}
	
}
