package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseOrderSort {

	public static void main(String[] args) {

		Integer[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> Reverse = list.stream()
				             .sorted(Collections.reverseOrder())
				             .collect(Collectors.toList());
		
		System.out.println(Reverse);
		
		
		System.out.println("Duplicate Numbers are : ");
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> Duplicate = list.stream()
				             .filter(n -> !set.add(n) )
				             .collect(Collectors.toList());
		
		System.out.println(Duplicate);
		
		System.out.println("After Removing Duplicate :");
		
		List<Integer> RemoveDuplicate = list.stream()
				                   .distinct()
				                   .collect(Collectors.toList());
		
		
		System.out.println(RemoveDuplicate);

	}
}
