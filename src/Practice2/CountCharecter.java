package Practice2;

import java.util.Arrays;
import java.util.List;

public class CountCharecter {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		
		char charecter = 'e';
		
		long count = strings.stream()
				.flatMapToInt(CharSequence::chars) // Convert strings to a stream of characters
				.filter(n -> n==charecter) // Filter characters equal to the specified character
				.count();
		
		System.out.println(charecter+" = "+count);
		
	}
}
