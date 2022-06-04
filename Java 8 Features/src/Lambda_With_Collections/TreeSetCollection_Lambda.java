package Lambda_With_Collections;

import java.util.TreeSet;

public class TreeSetCollection_Lambda {

	public static void main(String[] args) { // below lambda return descending order
		TreeSet<Integer> set = new TreeSet<>((obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);//descending order
//		TreeSet<Integer> set = new TreeSet<>((obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);//ascending order
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(20);
		set.add(50);
		System.out.println("Set : "+set);
	}
	
}
