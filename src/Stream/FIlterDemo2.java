package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterDemo2 {

	public static void main(String[] args) {
		
		Integer [] arr = {2,5,1,3,8,9,8,10,4,7,6};
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> SortedList = list.stream()
				                   .sorted()
				                   .collect(Collectors.toList());
		
		System.out.println("Sorted in ascending Order = "+SortedList);
		
		
		List<Integer> Sort = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("SOrted In decsending Order = "+Sort);
		
	}
}
