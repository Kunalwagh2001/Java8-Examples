package Practice;

import java.util.Arrays;

public class FindCommonElement {

	public static void main(String[] args) {
		
	    int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 7, 8};
        
        int[] common = Arrays.stream(arr1)
        		.filter(x -> Arrays.stream(arr2).anyMatch(y -> y==x))
        		.toArray();
        
        System.out.println(Arrays.toString(common));
	}
}
