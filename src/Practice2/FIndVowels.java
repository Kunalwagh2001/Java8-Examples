package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIndVowels {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
		 
		List<Character> vowels = strings.stream()
				.flatMapToInt(CharSequence::chars)  // Convert strings to a stream of characters
				.mapToObj(ch -> (char) ch)  // Convert the character code to a character
				.filter(ch -> "aeiouAEIOU".indexOf(ch) >=0 )  // Filter for vowels (both lowercase and uppercase)
				.collect(Collectors.toList());
		
		System.out.println(vowels);
	}
}
