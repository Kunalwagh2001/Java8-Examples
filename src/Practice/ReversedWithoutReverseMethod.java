package Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedWithoutReverseMethod {

	public static void main(String[] args) {
		
		  int[] numbers = {3, 8, 15, 12, 6, 10, 9, 4, 21, 30};
		  
		int [] reverse = IntStream.range(0, numbers.length).map(n -> numbers[numbers.length - n - 1]).toArray();
		
		System.out.println(Arrays.toString(reverse));
	}
}
