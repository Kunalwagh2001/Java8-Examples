package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {

		Integer[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		List<Integer> list = Arrays.asList(arr);

		List<Integer> Sorted = list.stream().sorted().collect(Collectors.toList());

		System.out.println(Sorted);
	}
}
