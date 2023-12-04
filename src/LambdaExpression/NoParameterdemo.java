package LambdaExpression;

public class NoParameterdemo {

	void show() {
		System.out.println("hi this is normal method");
	}
	
	
	public static void main(String[] args) {
		NoParameterdemo d = new NoParameterdemo();
		d.show();
		
		Noparamater d1 = () -> {
			return "Hi this NoParameterdemo method";
		};
		System.out.println(d1.Run());
	}
}
