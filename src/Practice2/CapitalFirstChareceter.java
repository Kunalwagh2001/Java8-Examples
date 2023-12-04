package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalFirstChareceter {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

		List<String> capital = strings.stream().map(n -> Character.toUpperCase(n.charAt(0))+n.substring(1)).collect(Collectors.toList());
		
		System.out.println(capital);
		
		
}
}