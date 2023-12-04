package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class FIndSpecificNumber {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,15};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a number :");
		
		int num = sc.nextInt();
		
		boolean found = Arrays.stream(array).anyMatch(n-> n==num);
		
		if(found) {
			System.out.println("is present ");
		}else {
			System.out.println("is not present");
		}
	}
}
