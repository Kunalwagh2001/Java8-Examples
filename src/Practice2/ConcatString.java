package Practice2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatString {

	public static void main(String[] args) {

		String[] strings = { "Hello", "World", "Java", "8" };

		String concat = Arrays.stream(strings).collect(Collectors.joining());

		System.out.println(concat);
		
		//using reduce method
		
		System.out.println("Use Reduce method");
		
		String count1 = Arrays.stream(strings)
				.reduce((s1,s2)-> s1+s2)
				.orElse("");
				
		System.out.println(count1);
	}
}
