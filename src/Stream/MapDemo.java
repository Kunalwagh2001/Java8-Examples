package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
String [] arr = {"Eve","Bob", "Charlie","Alice", "David"}; 
		
		List<String> list = Arrays.asList(arr);
		
		List<String> Uppercase = list.stream()
				                 .map(n -> n.toUpperCase())
				                 .collect(Collectors.toList());
		
		System.out.println("Uppercase list = "+Uppercase);
	}
}
