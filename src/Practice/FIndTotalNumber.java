package Practice;

import java.util.Arrays;
import java.util.List;

public class FIndTotalNumber {

	public static void main(String[] args) {
		 
		Integer arr[] = {1,2,4,5,7,4,9,8,6,2,1,3,8,7};
		
		List<Integer> list = Arrays.asList(arr);
		
		long TotalNumber = list.stream().count();
		
		System.out.println(TotalNumber);
	}
}
