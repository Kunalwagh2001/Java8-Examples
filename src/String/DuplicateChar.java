package String;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String text = "Mahabharat";
		
		Map<Integer, Long> charCounts = text.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		
		
		charCounts.entrySet().stream()
        .filter(entry -> entry.getValue() > 1)
        .map(entry -> String.valueOf((char) entry.getKey().intValue()))
        .forEach(System.out::println);
		
	}
}
