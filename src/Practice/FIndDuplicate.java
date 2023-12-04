package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicate {

	public static void main(String[] args) {
		
		Integer arr[] = {1,2,4,5,7,4,9,8,6,2,1,3,8,7};
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list =  Arrays.asList(arr);
		
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> duplicate = list.stream()
				                 .filter(n -> !set.add(n))
				                 .collect(Collectors.toSet());
		
		System.out.println(duplicate);
		
		
	}
}
