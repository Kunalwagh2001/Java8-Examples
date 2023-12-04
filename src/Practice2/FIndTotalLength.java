package Practice2;

import java.util.Arrays;

public class FIndTotalLength {

	public static void main(String[] args) {
		
		String[] string = { "apple", "banana", "cherry", "date" };
		
		long count = Arrays.stream(string).mapToInt(String::length).sum();
		
		System.out.println(count);
	}
}
