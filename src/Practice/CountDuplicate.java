package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicate {

	public static void main(String[] args) {

		Integer[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15, 10, 8, 8 };

		List<Integer> list = Arrays.asList(arr);
		
		Map<Integer, Long> duplicate = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		duplicate.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println(+entry.getKey()+" = "+entry.getValue()));
	}
}
