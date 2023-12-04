package LambdaExpression;

public class Demo1 {

	public static void main(String[] args) {
		Demo2 d = ()-> {
			System.out.println("Hi this is lambda Expression");
		};
		
		d.Say();
		
	}
	
	
}
