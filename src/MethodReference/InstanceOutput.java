package MethodReference;

public class InstanceOutput implements InstanceMethod {

	@Override
	public void show() {
     System.out.println("Instance Method");		
	}

	public static void main(String[] args) {
		
		InstanceOutput obj = new InstanceOutput();
		
		InstanceMethod ref = obj::show;
		
		ref.show();
		
	}
	
}
