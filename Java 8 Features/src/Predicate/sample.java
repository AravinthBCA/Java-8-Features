package Predicate;

public class sample {

	public static void main(String[] args) {
		int arr[] = {1,29,21,23,44,35,56,42,21,10};
		int e=100,g=108,s=0;
		while(e%2==0) {
			s=arr[e-100]+arr[e+1-100];
			System.out.println(s);
			if(e%7==0) {
				System.out.println("brea");
			}
			else {
				e=e+1;
				if(e==g+1) {
					System.out.println("brea");
					break;
				}
				continue;
			}
		}
	}
}
