package Practice2;

import java.util.Arrays;
import java.util.List;

public class SortStringsByCharacterLengthWithCount {

	public static void main(String[] args) {
		
		String[] string = {"apple", "banana", "cherry", "date", "fig"};
		
		 List<String> strings = Arrays.asList(string);

	        // Sort strings by character length using Java 8
	        strings.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));

	        // Print the sorted strings with character counts
	        strings.forEach(str -> System.out.println(str + " - " + str.length()));
	}
}
