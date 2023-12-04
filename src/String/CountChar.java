package String;

public class CountChar {

	public static void main(String[] args) {
		
		String name = "Kunal Wagh";
		
		char t = 'a';
		
		long count = name.chars()
				.filter(n -> n==t)
				.count();
		
		System.out.println(t+" = "+count);
	}
}
