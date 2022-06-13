package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streams_Sort_Count {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(6);list.add(3);list.add(2);list.add(5);list.add(4);
			
		// sort the elements using stream
		list = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list : "+list);
		
		// customized sorting the elements using stream
		list = (ArrayList<Integer>) list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Customized Sorting Order list : "+list);
				
		int count = (int) list.stream().filter(i->i%2==0).count(); // return the count
		System.out.println("Count : "+count);
	}
}
