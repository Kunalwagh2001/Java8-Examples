package Practice2;

import java.util.Arrays;
import java.util.List;

public class CheckSubString {

	public static void main(String[] args) {
		
		 List<String> strings = Arrays.asList("apple", "banana", "cherry", "date" , "cherry");
		 
		 String substring = "cherry";
		 
		 Boolean result = strings.stream().anyMatch(n -> n.contains(substring));
		 
		 System.out.println(result);
		 
		 
		 long count = strings.stream().filter(n -> n.contains(substring)).count();
		 
		 System.out.println(substring+" = "+count);
	}
}
