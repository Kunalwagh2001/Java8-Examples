package Practice;

import java.util.Arrays;

public class SUmOFArrayUsingReduce {

	public static void main(String[] args) {
		
		  int[] values = {3, 8, 15, 12, 6, 10, 9, 4, 21, 30};
		  
		  int sum = Arrays.stream(values).reduce((a,b) -> a+b).orElse(1);
		  
		  System.out.println(sum);
	}
}
