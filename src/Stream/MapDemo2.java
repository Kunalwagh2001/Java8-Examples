package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		
	
	
	Integer [] arr = {1,2,4,3,5,7,6,8,10,9};
	
	List<Integer> list = Arrays.asList(arr);
	
	List<Integer> Squares = list.stream()
			                .map(n-> n*n)
			                .collect(Collectors.toList());
	
	System.out.println("Squares of the list = "+Squares);
	
}
}