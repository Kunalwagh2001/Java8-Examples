package Practice;

import java.util.Arrays;

public class FIndOddNumber {

	public static void main(String[] args) {
		
		  int[] values = {3, 8, 15, 12, 6, 10, 9, 4, 21, 30};
		  
		  int[] odd = Arrays.stream(values).filter(n -> n%2!=0).toArray();
		  
		  System.out.println(Arrays.toString(odd));
	}
}
