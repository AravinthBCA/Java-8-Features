package Predicate_PrimitivePredicate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class SoftwareEngineer{
	
	private String username;
	private int age;
	private boolean isHavingGirlFriend;
	
	public SoftwareEngineer(String username, int age, boolean isHavingGirlFriend) {
		super();
		this.username = username;
		this.age = age;
		this.isHavingGirlFriend = isHavingGirlFriend;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHavingGirlFriend() {
		return isHavingGirlFriend;
	}
	public void setHavingGirlFriend(boolean isHavingGirlFriend) {
		this.isHavingGirlFriend = isHavingGirlFriend;
	}
}

public class PredicateImplementation_3 {

	public static void main(String[] args) {
		SoftwareEngineer[] arr =  { new SoftwareEngineer("aravinth",17,true),
									new SoftwareEngineer("manivel",23,true),
									new SoftwareEngineer("sankar",23,false),
									new SoftwareEngineer("kishore",18,false),
									new SoftwareEngineer("ruban",18,true)};
		Predicate<SoftwareEngineer> p = user -> user.getAge() >= 18 && user.isHavingGirlFriend() == true;
		for (SoftwareEngineer softwareEngineer : arr) {
			if(p.test(softwareEngineer)) {
				System.out.println("Allowed Name : "+softwareEngineer.getUsername());
			}
		}
	}
	
}
