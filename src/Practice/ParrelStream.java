package Practice;

import java.util.Arrays;
import java.util.List;

public class ParrelStream {

	public static void main(String[] args) {
		
		Integer [] arr = {1,2,3,4,5,6,7};
		
		List<Integer> list = Arrays.asList(arr);
		
	//  list.parallelStream().forEach(System.out::print); /// they did not get any output
		
	
		list.parallelStream().forEachOrdered(System.out::print); // it will give order...
	}
}
