package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAccordingToCharecter {

	public static void main(String[] args) {
		
		String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Anna"};

		List<String> list = Arrays.asList(names);
		
		List<String> find = list.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(find);
	}
}
