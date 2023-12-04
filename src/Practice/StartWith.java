package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {

	public static void main(String[] args) {
		
		Integer[] arr = {10,23,36,17,30,22,14};
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> result = list.stream()
				               .map(String::valueOf)  // convert integer into string
				               .filter(n -> n.startsWith("1"))
				               .map(Integer::parseInt) // convert string to integer
				               .collect(Collectors.toList());
		
		System.out.println(result);
				              
	}
}
