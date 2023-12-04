package String;

public class Vowels {
	
	public static void main(String[] args) {
		
		String name = "Kunal Wagh";
		
		name.chars()
				.mapToObj(n-> (char) n)
				.filter(n-> "aeiouAEIOU".contains(String.valueOf(n)))
				.forEach(System.out::print);
		
		
	}

}
