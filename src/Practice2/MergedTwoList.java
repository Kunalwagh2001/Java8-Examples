package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		List<String> list2 = Arrays.asList("cherry", "date", "fig");
		
		List<String> list = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(list);
	
	
	//Using FlatMap Method
	
	List<String> newList = Stream.of(list1,list2).flatMap(List::stream).distinct().collect(Collectors.toList());
	
	System.out.println(newList);
	
	
}
}