package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		Integer[] arr = {4, 16, 9, 25, 49, 36, 64, 100};
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Double> squareroot = list.stream()
				                   .map(Math::sqrt)
				                   .collect(Collectors.toList());

		System.out.println("Square root of list = "+squareroot);
		
	}
}
