package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSizeOfArray {

	public static void main(String[] args) {
		List<List<Integer>> lists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);

			List<Integer> sizes = lists.stream()
			        .map(List::size)
			        .collect(Collectors.toList());
			System.out.println(sizes);
	}
}
