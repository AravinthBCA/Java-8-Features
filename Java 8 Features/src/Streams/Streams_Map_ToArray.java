package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams_Map_ToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
		list = (ArrayList<Integer>) list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("----------------------------------");
		Integer[] arr = list.stream().toArray(Integer[] :: new);
		System.out.println(Arrays.toString(arr));
	}
} 
