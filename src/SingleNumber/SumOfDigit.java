package SingleNumber;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n = 12345;
		
		int sum = Integer.toString(n)
				.chars()
				.map(Character::getNumericValue)
				.sum();
		
		System.out.println("SUm of Digit = "+sum);
	}
}
