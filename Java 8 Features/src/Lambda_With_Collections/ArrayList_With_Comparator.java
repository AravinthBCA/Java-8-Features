package Lambda_With_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		return (o1>o2)?-1:(o1<0o2)?1:0; // descending order
		return (o1<o2)?-1:(o1>o2)?1:0; // ascending order
	}
	
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o2.compareTo(o1); //	descending order
//		return o2.compareTo(o1); // ascending order
//	}
}

public class ArrayList_With_Comparator {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		Collections.sort(list, new MyComparator());
		System.out.println("List : "+list);
	}

}







