package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> takeWhileNumbers = numbers.stream().takeWhile(n -> n < 5).collect(Collectors.toList());
		System.out.println(takeWhileNumbers);

		List<Integer> dropWhileNumbers = numbers.stream().dropWhile(n -> n < 5).collect(Collectors.toList());
		System.out.println(dropWhileNumbers);

	}
}
