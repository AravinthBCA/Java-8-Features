package Lambda_With_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_With_Comparator_Lambda {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		Collections.sort(list,(obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);
		System.out.println("List : "+list);
	}

}







