package Predicate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	private String username;
	private String password;
	
	User(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class PredicateImplementation_4 {

	public static void main(String[] args) {
		Predicate<User> p = user -> user.getUsername().equals("aravinth") && 
									user.getPassword().equals("password");
		System.out.println("Enter username and password : ");
		Scanner in = new Scanner(System.in);		
		if(p.test(new User(in.next(),in.next()))) {
			System.out.println("Successfully Logged in...");
		}
		else {
			System.out.println("Invalid Username and Password...");
		}
	}
	
}
