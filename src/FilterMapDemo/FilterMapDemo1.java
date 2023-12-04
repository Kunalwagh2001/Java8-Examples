package FilterMapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapDemo1 {

	public static void main(String[] args) {
String [] arr = {"Eve","Bob", "Charlie","Alice", "David"}; 
		
		List<String> list = Arrays.asList(arr);
		
		List<String> result = list.stream()
				              .filter(n -> n.startsWith("C"))
				              .map(n -> n.toUpperCase())
				              .collect(Collectors.toList());
		
		System.out.println(result);
	}
}
