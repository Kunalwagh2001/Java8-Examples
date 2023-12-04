package FilterMapDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Laptop", 8999));
		list.add(new Product("Phone", 4999));
		list.add(new Product("Tablet", 2999));
		list.add(new Product("Keyboard", 4999));
		list.add(new Product("Mouse", 1999));
		
		List<String> result = list.stream()
				               .filter(price -> price.getPrice()<3000)
				               .map(price -> price.getName()+ "=" + price.getPrice())
				               .collect(Collectors.toList());
		
		
		System.out.println(result);

		
	}
}
