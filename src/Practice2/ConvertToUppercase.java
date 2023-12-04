package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

		List<String> toUppercase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(toUppercase);
	}
}
