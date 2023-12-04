package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterDemo4 {

	public static void main(String[] args) {
		
		String [] arr = {"Eve","Bob", "Charlie","Alice", "David"}; 
		
		List<String> list = Arrays.asList(arr);
		
		List<String> length = list.stream()
				             .filter(n -> n.length()<= 3)
				             .collect(Collectors.toList());
		
		System.out.println("List = "+length);
		
		
	}
}
