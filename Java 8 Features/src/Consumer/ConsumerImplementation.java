package Consumer;

import java.util.function.Consumer;

public class ConsumerImplementation {
	public static void main(String[] args) {
		Consumer<String> c = str ->{ 
									for(int i=0; i<2; i++) {
										System.out.println(str);
									}
								   };
		Consumer<String> c1 = str -> System.out.print("hi ");
		Consumer<String> c2 = str -> System.out.print(str);
		Consumer<String> c3 = str -> System.out.print(" welcome");
		c.accept("aravinth");
		c1.andThen(c2).andThen(c3).accept("ruban");;
	}
}
