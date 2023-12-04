package Practice;

import java.math.BigInteger;
import java.util.Arrays;

public class FIndPrimeNumber {

	public static void main(String[] args) {
		
		int[] numbers = {2, 4, 3, 9, 11, 14, 17, 19, 25, 29};
		
		int[] prime = Arrays.stream(numbers).distinct().filter(n -> n > 1 && isPrime(n)).toArray();
		
		System.out.println("prime Numbers Are = "+Arrays.toString(prime));
	}

	private static boolean isPrime(int n) {
		return BigInteger.valueOf(n).isProbablePrime(100);
	}
}
