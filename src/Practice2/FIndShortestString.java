package Practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FIndShortestString {

	public static void main(String[] args) {
		
		String[] string = { "apple", "banana", "cherry", "date", "late" };
		
		Optional<String> min = Arrays.stream(string).min(Comparator.comparing(String::length));
		
		if(min.isPresent()) {
			System.out.println(min.get());
		}else {
			System.out.println("Not Found");
		}
	}
}
