package Date_Time_API;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class Date_API {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int dd  = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		LocalDate birthday = LocalDate.of(2001, 10, 19);
		Period p = Period.between(birthday,date);
		System.out.println("date : "+dd+" --- "+" month : "+mm+" --- "+" year : "+yy);
		System.out.printf("Birthday Date difference : %d",p.getMonths());
		System.out.println("\nEnter the year to check leap or not : ");
		Scanner in = new Scanner(System.in);
		int leap = in.nextInt();
		Year y = Year.of(leap);
		System.out.println(y.isLeap());
	}
}
