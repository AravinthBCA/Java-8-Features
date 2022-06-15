package Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time_API {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		System.out.println("Time : "+time);
		System.out.println("Date : "+date);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}
