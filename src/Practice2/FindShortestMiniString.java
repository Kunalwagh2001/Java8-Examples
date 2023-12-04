package Practice2;

import java.util.Arrays;

public class FindShortestMiniString {

	public static void main(String[] args) {
		
		String[] string = { "apple", "banana", "cherry", "date", "late" , "kate"};
		
		int shortstring = Arrays.stream(string).mapToInt(String::length).min().orElse(0);
		
		Arrays.stream(string).filter(n -> n.length()==shortstring).forEach(System.out::println);
	}
}
