package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		Integer arr [] = {1, 2, 3, 4, 5};
		Integer arr1 [] = {6, 7, 8, 9, 10};
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(arr),Arrays.asList(arr1));
		
		List<Integer> merged = list.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(merged);
		
	}
}
