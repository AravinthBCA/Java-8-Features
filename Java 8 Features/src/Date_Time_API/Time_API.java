package Date_Time_API;

import java.time.LocalTime;

public class Time_API {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.println("Hour : "+h+" --- "+"Minute : "+m+" --- "+"Second : "+s+" --- "+"Nano : "+n);
	}
}
