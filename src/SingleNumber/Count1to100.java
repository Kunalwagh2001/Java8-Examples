package SingleNumber;

import java.util.stream.IntStream;

public class Count1to100 {

	public static void main(String[] args) {
		
		int n = 100;
		
		int sum = IntStream.rangeClosed(1, n).sum();
		
		System.out.println("SUm is = "+sum);
	}
}
