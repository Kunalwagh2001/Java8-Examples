package FilterMapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterMapDemo2 {

	public static void main(String[] args) {
		
		
		Integer [] arr = {2,5,1,3,8,9,8,10,4,7,6};
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> result = list.stream()
				               .filter(n -> n%2==0)
				               .map(n -> n*n)
				               .collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
