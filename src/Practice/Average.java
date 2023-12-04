package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int Sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("Sum of all number is :"+Sum);
		
		OptionalDouble Average = list.stream().mapToDouble(Integer::doubleValue).average();
		
		System.out.println("Average is :"+Average.getAsDouble());
		
		
		
		/*
		 * double average = Arrays.stream(list).average().orElse(0.0);
		 * 
		 * System.out.println(average);	
		 */
		
		
	}
}
