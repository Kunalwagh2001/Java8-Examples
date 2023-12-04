package Practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FIndLongestString {

	public static void main(String[] args) {
		
		 List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

		Optional<String> max = strings.stream().max(Comparator.comparing(String::length));
		
		if(max.isPresent()) {
			System.out.println(max.get());
		}else {
			System.out.println("Not FOund");
		}
		
		
	}
}