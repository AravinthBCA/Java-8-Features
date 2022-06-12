package Supplier;

import java.util.function.IntSupplier;

public class PrimitiveSupplier {
	public static void main(String[] args) {
		IntSupplier obj = () -> (int)(Math.random()*10);
		System.out.println(obj.getAsInt());
	}
}
