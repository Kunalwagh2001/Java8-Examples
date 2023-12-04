package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFIrstCharecter {

	public static void main(String[] args) {
		
		String[] string = { "apple", "xanana", "cherry", "date" };

		List<Character> ch = Arrays.stream(string)
				.map(s -> s.charAt(0))
				.collect(Collectors.toList());
		
		System.out.println(ch);
	}
}
