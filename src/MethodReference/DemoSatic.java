package MethodReference;

@FunctionalInterface
public interface DemoSatic {

	void Say();
	
	static void diplay() {
		System.out.println("display method");
	}
	
}
