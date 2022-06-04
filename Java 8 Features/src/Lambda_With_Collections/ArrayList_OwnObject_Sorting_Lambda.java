package Lambda_With_Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	private int number;
	private String name;
	
	Employee(int number,String name){
		this.setNumber(number);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [number=" + getNumber() + ", name=" + name + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class ArrayList_OwnObject_Sorting_Lambda {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"manivel"));
		list.add(new Employee(4,"ruban"));
		list.add(new Employee(2,"sankar"));
		list.add(new Employee(5,"deepak"));
		list.add(new Employee(3,"aravinth"));
//		below collection sort for ascending
		Collections.sort(list,(obj1,obj2)->
						(obj1.getNumber()<obj2.getNumber())?-1:(obj1.getNumber()>obj2.getNumber())?1:0);

//		below collection sort for descending
//		Collections.sort(list,(obj1,obj2)->
//						(obj1.getNumber()>obj2.getNumber())?-1:(obj1.getNumber()<obj2.getNumber())?1:0);
		System.out.println("List : "+list);
	}

}











