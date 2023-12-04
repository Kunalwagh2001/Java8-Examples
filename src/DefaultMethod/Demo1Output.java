package DefaultMethod;

public class Demo1Output implements Demo1 {

	@Override
	public void say() {
     System.out.println("Abstract Method");
     
	}

	public static void main(String[] args) {
		Demo1Output d = new Demo1Output();
		d.say();
		d.display();
	}
	
	
}