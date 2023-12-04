package Practice2;

import java.util.Arrays;

public class ReversedWithoutUsingReversed {

	public static void main(String[] args) {
		
		String[] arr = {"apple", "banana", "cherry", "date", "fig"};
		
		Arrays.sort(arr, (str1,str2) -> str2.compareTo(str1));
		
		System.out.println(Arrays.toString(arr));
		
	}
}
