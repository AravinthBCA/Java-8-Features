package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class FunctionImplementation_1 {
	
	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("aravinth",1000));
		list.add(new Employee("manivel",3000));
		list.add(new Employee("kishore",4000));
		list.add(new Employee("sankar",2000));
		list.add(new Employee("ruban",5000));
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		
		Function<ArrayList<Employee>,Double> f = emp -> {
															double total = 0;
															for(Employee temp : emp) {
																total += temp.getSalary();
															}
															return total;
														};
		System.out.println("Total Salary : "+f.apply(list));
		
		Predicate<Employee> p = emp -> emp.getSalary() <=3000 ;
		Function<ArrayList<Employee>,ArrayList<Employee>> f1 = emp -> {
											for (Employee employee : emp) {
												if(p.test(employee)) {
													employee.setSalary(employee.getSalary()+100);
												}
											}
											return emp;
										};
										
		System.out.println("List : "+f1.apply(list));
	}
	
}
