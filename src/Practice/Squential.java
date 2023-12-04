package Practice;

import java.util.Arrays;
import java.util.List;

public class Squential {

	public static void main(String[] args) {
		
		Integer [] arr = { 2,3,5,4,1,6,8,7};
		
	    List<Integer> list  = Arrays.asList(arr);
	    
	    list.stream().forEach(System.out::println);
	}
	
}
