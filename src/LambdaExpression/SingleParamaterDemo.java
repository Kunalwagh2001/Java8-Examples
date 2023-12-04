package LambdaExpression;

public class SingleParamaterDemo {

	public static void main(String[] args) {
		
		SingleParamater d = (name) -> {
			return "Hello world "+name; 
		};
		System.out.println(d.Name("Kunal"));
		
		
		SingleParamater d2 = (name) -> {
			return "Hello world "+name;
		};
		
		System.out.println(d2.Name("Sunny"));
		
		
	}
	
	
}
