package Predicate_PrimitivePredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	private String username;
	private String designation;
	private int salary;
	private String city;
	
	public Employee(String username, String designation, int salary, String city) {
		super();
		this.username = username;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", designation=" + designation + ", salary=" + salary + ", city="
				+ city + "]";
	}
}

public class RealtimeProjectUsingPredicate {

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("aravinth","CEO",10000,"chennai"));
		list.add(new Employee("manivel","senior manager",5000,"trichy"));
		list.add(new Employee("ruban","senior developer",1000,"mumbai"));
		list.add(new Employee("kishore","manager",3000,"bangalore"));
		list.add(new Employee("deepak","security",1000,"cochi"));
	}
	
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee employee : list) {
			if(p.test(employee)) {
				System.out.println(employee);
			}
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		Predicate<Employee> p = emp -> emp.getDesignation().equals("manager");
		Predicate<Employee> p1 = emp -> emp.getCity().equals("bangalore");
		Predicate<Employee> p2 = emp -> {	if(emp.getSalary() > 3000) {
												emp.setSalary(emp.getSalary()+1000);
												return true;
											}
											return false;
										};
		display(p,list);
		System.out.println("---------------------------------------------------");
		display(p1,list);
		System.out.println("---------------------------------------------------");
		display(p2,list);
		System.out.println("---------------------------------------------------");
		display(p.and(p1),list);
		System.out.println("---------------------------------------------------");
		display(p1.negate(),list);
	}
	
}
