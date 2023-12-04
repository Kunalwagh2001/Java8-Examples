package String;

public class FindTotalNumberOfChar {

	public static void main(String[] args) {
		
		String txt = "Kunal Wagh";
		
		long total = txt.chars().count();
		
		System.out.println(total);
	}
}
