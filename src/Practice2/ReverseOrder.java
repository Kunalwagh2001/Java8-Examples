package Practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {

	public static void main(String[] args) {

		String[] string = { "apple", "banana", "cherry", "date" };
		
		Arrays.stream(string).sorted(Collections.reverseOrder()).forEach(System.out::println);

		
		

	}
}
