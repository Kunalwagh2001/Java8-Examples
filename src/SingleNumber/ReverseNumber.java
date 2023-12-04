package SingleNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n= 12345;
		
		String rev = new StringBuilder(Integer.toString(n)).reverse().toString();
		
		System.out.println("Reverse NUmber = "+rev);
	}
}
