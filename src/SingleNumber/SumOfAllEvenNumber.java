package SingleNumber;

import java.util.stream.IntStream;

public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		
		int n = 100;
		
		int sum = IntStream.rangeClosed(1, n)
				.filter(x -> x%2==0)
				.sum();
		
		System.out.println("Sum of Even NUmber = "+sum);
	}
}
