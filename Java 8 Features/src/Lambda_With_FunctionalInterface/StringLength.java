package Lambda_With_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//@FunctionalInterface
interface inter1{
	public int StringLength(String s);
//	public int StringL(int s); // throw an error
}

public class StringLength{

	public static void main(String[] args) {
		inter1 inter = (s)->s.length();
		System.out.println(inter.StringLength("aravinth"));
 	}	
	
}
