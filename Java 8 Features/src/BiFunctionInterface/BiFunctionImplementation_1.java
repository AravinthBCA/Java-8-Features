package BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
	
	public String name;
	public int rollNumber;
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
}

public class BiFunctionImplementation_1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		BiFunction<String,Integer,Student> bi = (a,b) -> new Student(a,b);
		list.add(bi.apply("aravinth", 2080715));
		list.add(bi.apply("bala", 2080716));
		list.add(bi.apply("prathis", 2080717));
		System.out.println(list);
	}
}
