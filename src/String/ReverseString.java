package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Hello world";
		
		String reverse = name.chars()
				.mapToObj(n -> String.valueOf((char)n))
				.reduce("",(a,b) -> b+a);
		
		System.out.println(reverse);
		
	}
}
