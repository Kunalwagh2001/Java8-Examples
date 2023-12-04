package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CaptilaizeFirstWord {

	public static void main(String[] args) {
		
		String txt = "kunal wagh";
		
		String capitalized = Arrays.stream(txt.split("\\s+"))
			    .map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1))
			    .collect(Collectors.joining(" "));
			System.out.println(capitalized);
                   
	}
}
