package SingleNumber;

import java.util.stream.IntStream;

public class FindPrimeNUmber {

	public static void main(String[] args) {
		
		int n = 8;
		
		boolean isprime = n>1 && IntStream.range(2, n).noneMatch(i -> n%i==0);
		
		if(isprime) {
			System.out.println("Is Prime Number");
		}else {
			System.out.println("Is not Prime Number");
		}
	}
}
