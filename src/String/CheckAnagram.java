package String;
import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		
		String str = "listen";
		String str2 = "silent";
		
		
		
		if(str.length()!=str2.length()) {
			System.out.println("it is not Anagram");
		}
		
		Boolean areAnagram = Arrays.equals(str.chars().sorted().toArray(),str2.chars().sorted().toArray());
		
		if(areAnagram) {
			System.out.println("Are Anagrram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
