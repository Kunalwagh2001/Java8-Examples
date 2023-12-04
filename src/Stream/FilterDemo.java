package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		
		Integer [] arr = {1,2,4,3,5,7,6,8,10,9};
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> EvenNumber = list.stream()
				           .filter(n-> n%2==0)
				           .collect(Collectors.toList());
		
		System.out.println("Even Numbers = "+EvenNumber);
	}
}
