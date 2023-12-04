package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLength {

	public static void main(String[] args) {
		
		String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Anna"};

		List<Integer> length = Arrays.stream(names).map(String::length).collect(Collectors.toList());
		
		System.out.println(length);
	}
}
