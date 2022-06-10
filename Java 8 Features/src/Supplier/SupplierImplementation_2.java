package Supplier;

import java.util.Arrays;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierImplementation_2 {

	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			String  otp = "";
			for (int i = 1; i <=6; i++) {
				otp +=(int)(Math.random()*10); // it return in between 0 to 9 only
			}
			return otp;
		};
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}
	
}
