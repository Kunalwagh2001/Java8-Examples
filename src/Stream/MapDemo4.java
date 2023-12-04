package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo4 {

	public static void main(String[] args) {
		
		
		String [] arr = {"Eve","Bob", "Charlie","Alice", "David"}; 
		
		List<String> list = Arrays.asList(arr);

		List<Character> FirstChar = list.stream()
				                 .map(n -> n.charAt(0))
				                 .collect(Collectors.toList());
		
		System.out.println("First Charecters of list = "+FirstChar);
	}
}
