package Practice2;

import java.util.Arrays;

public class FindLastString {

	public static void main(String[] args) {
		
		String[] string = { "apple", "banana", "cherry", "kate" };
		
		String last = Arrays.stream(string).reduce((first,second) -> second).orElse("");
		
		System.out.println(last);
	}
}
