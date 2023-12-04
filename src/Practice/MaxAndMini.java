package Practice;

import java.util.Arrays;
import java.util.List;

public class MaxAndMini {
	
	public static void main(String[] args) {
		
		Integer [] arr = {10,15,8,49,25,98,98,32,15};
		
		int Max = Arrays.stream(arr).max(Integer::compareTo).get() ;
		
		System.out.println("Maximum Number is : "+Max);
		
		Integer Min = Arrays.stream(arr)
				      .min(Integer::compareTo)
				      .get();
		
		System.out.println("Minimum Number is : "+ Min);
	}

}
