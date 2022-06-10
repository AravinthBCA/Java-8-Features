package BiFunctionInterface;

import java.util.function.BiConsumer;

public class BiConsumerImplementation {
	
	public static void main(String[] args) {
		BiConsumer<String,String> bi = (a,b) -> System.out.println(a+b);
		bi.accept("aravinth","kaliyamoorthy");
	}

}
