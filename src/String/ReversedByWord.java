package String;

import java.util.Arrays;

public class ReversedByWord {

	public static void main(String[] args) {
		
		String name = "Kunal Wagh";
		
		String reversed = Arrays.stream(name.split("\\s+"))
				.reduce((a, b) -> b+" "+a)
				.orElse("");
		
		System.out.println(reversed);
				
				
	}
}
