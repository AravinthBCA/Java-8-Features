package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streams_Filter_ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(6);list.add(3);list.add(2);list.add(5);list.add(4);
		
		// below line return the list
		list = (ArrayList<Integer>) list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);		
		System.out.println("----------------------------------");
		// traverse the element using foreach lambda expression
		list.stream().forEach(s->System.out.println(s));
		System.out.println("----------------------------------");
		// traverse the element using foreach method reference
		list.stream().forEach(System.out :: println);
	}
}
