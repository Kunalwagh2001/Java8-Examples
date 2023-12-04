package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FIndSecondSmallestNumber {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15, 10, 8);
		 
		 Integer smallestSecondNUmber = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		 
		 System.out.println("Second Smallest Number = "+smallestSecondNUmber);
	}
}
