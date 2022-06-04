package Lambda_With_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapUsingHashMap {
	
	public static void main(String[] args) {
// treemap return the element in ascending order 
// lambda expression statement return descending order
		TreeMap<Integer,String> set = new TreeMap<>((obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);
		set.put(10,"manivel");
		set.put(30,"aravinth");
		set.put(40,"ruban");
		set.put(20,"sankar");
		set.put(50,"deepak");
		System.out.println("Set : "+set);
		
// hashmap doesn't have any order
// we can't use comparator and lambda expression because hashmap doesn't have any parameter's
//		Map<Integer,String> hashSet = new HashMap<>((obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);
//	above line throw an error because of hashmap doesn't allow any parameter
		Map<Integer,String> hashSet = new HashMap<>();
		hashSet.put(10,"manivel");
		hashSet.put(30,"aravinth");
		hashSet.put(40,"ruban");
		hashSet.put(20,"sankar");
		hashSet.put(50,"deepak");
		System.out.println("Set : "+hashSet);
	}

}
