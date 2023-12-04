package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheLength {

	public static void main(String[] args) {
		
		String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Anna"};

		List<String> list  = Arrays.stream(names).filter(n -> n.length()>5).collect(Collectors.toList());
		
		for(String i : list) {
			System.out.println(i);
		}
	}
}
