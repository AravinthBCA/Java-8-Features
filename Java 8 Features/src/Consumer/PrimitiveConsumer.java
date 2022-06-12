package Consumer;

import java.util.function.IntConsumer;

public class PrimitiveConsumer {
	public static void main(String[] args) {
		IntConsumer con = i -> System.out.println("Your Value : "+i);
		con.accept(5);
	}
}
