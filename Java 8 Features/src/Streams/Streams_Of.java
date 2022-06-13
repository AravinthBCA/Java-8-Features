package Streams;

import java.util.stream.Stream;

public class Streams_Of {
	public static void main(String[] args) {
		// using stream for group of values
		Stream<Integer> str = Stream.of(1,2,3,4,5);
		str.forEach(System.out :: println);
		System.out.println("-----------------------------------------");
		// using stream for array of values
		Double[] arr = {10.1,10.3,10.6,10.5};
		Stream<Double> str1 = Stream.of(arr);
		str1.forEach(System.out :: println);
	}
}
