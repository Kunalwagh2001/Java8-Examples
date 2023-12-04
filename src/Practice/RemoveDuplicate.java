package Practice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Integer arr[] = {1,2,4,5,7,4,9,8,6,2,1,3,8,7};
		
		List<Integer> list = Arrays.asList(arr);
		
		Object[] Duplicate = list.stream().distinct().toArray();
		
		System.out.println(Arrays.toString(Duplicate));
	}
}
