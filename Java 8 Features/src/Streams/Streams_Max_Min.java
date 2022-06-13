package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streams_Max_Min {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(6);list.add(3);list.add(2);list.add(5);list.add(4);
		
		// get min value in the list 
		int min = list.stream().min((obj1,obj2)->obj1.compareTo(obj2)).get();
		System.out.println("Minimum Value : "+min);
		
		// get max value in the list 
		int max = list.stream().max((obj1,obj2)->obj1.compareTo(obj2)).get();
		System.out.println("Maximum Value : "+max);
		
		
	}
}
