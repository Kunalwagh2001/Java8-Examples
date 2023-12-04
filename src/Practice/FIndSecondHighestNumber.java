package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FIndSecondHighestNumber {

	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15, 10, 8);

       Optional<Integer> SeondHighestNumber = numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();
       
       System.out.println("Second highest number = "+SeondHighestNumber.get());
	}
}
