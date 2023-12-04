package MethodReference;

public class DemoOutput implements Demo {

	@Override
	public void Say() {
       System.out.println("Say Method");
       
	}
	
	static void run() {
		System.out.println("Run method");
	}

	public static void main(String[] args) {
		
		DemoOutput d = new DemoOutput();
		d.Say();
		
		
		Demo runnable = DemoOutput::run;
        runnable.Say();
		
	}
}
