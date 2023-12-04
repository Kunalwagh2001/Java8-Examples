package FilterDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Output {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Kunal", 22));
		list.add(new Student("Rahul", 18));
		list.add(new Student("Aakash", 20));
		list.add(new Student("Bhavesh", 25) );
		
		List<Student> Above20 = list.stream()
				                .filter(n-> n.getAge()>20)
				                .collect(Collectors.toList());
		
		System.out.println("List of the Student:");
		list.forEach(System.out::println);
		
		System.out.println("Age is Greater than 20 = "+Above20);
		
		
		
	}
}
