package BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{
	public String name;
	public int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class BiConsumerImplementation_1 {
	public static void main(String[] args) {
		BiConsumer<Employee,Integer> bi = (a,b) -> a.salary = a.salary + b;
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("aravinth", 30));
		list.add(new Employee("bala", 20));
		list.add(new Employee("prathis", 40));
		for (Employee employee : list) {
			bi.accept(employee, 10);
		}
		System.out.println(list);
	}
}






