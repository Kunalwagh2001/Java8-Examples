package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAllAreGreaterThanNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int number = 4;
		
		boolean num = list.stream().allMatch(n-> n > number);
		
		System.out.println(num);
	}
}
