package LambdaExpression;

public class MultipleParamaterDemo {

	public static void main(String[] args) {
		
		MultipleParamater add = (a,b) -> (a+b);
		System.out.println("Addition ="+add.Addition(10, 20));
		
		
		MultipleParamater sub = (a,b) -> (a-b);
		
		System.out.println("Substraction ="+sub.Addition(100, 50));
		
		
		
		MultipleParamater mult = (a,b) -> (a*b);
		
		System.out.println("Multiplication ="+mult.Addition(10, 2));
		
		
		MultipleParamater div = (a,b) -> (a/b);
		
		System.out.println(("Division =" +div.Addition(10, 5)));
	}
	
}
