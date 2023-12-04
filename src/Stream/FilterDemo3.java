package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	
	public static void main(String[] args) {
		
		String [] arr = { "Eve","Bob", "Charlie","Alice", "David" };
		
		List<String> list = Arrays.asList(arr);
		
		List<String> Charector = list.stream()
				                .filter(n -> n.startsWith("C"))
				                .collect(Collectors.toList());
		
		System.out.println("Charector = "+Charector);
		
	}
}
