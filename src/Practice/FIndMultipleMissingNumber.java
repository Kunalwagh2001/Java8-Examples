package Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FIndMultipleMissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 4, 6, 8, 7, 10};
		
		Arrays.sort(arr);
		
		System.out.println("Sort The Array List : "+Arrays.toString(arr));
		
		Set<Integer> number = Arrays.stream(arr).boxed().collect(Collectors.toSet());  // Convert the sorted array into a Set to remove duplicates
		
		Set<Integer> missingNumber = IntStream.rangeClosed(2, 10)
				.filter(n -> !number.contains(n))
				.boxed()
				.collect(Collectors.toSet());
		
		System.out.println("Mutltiple Missing Number : "+missingNumber);
	}
}
