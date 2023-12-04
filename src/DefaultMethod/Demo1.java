package DefaultMethod;

public interface Demo1 {

	void say();
	
	default void display() {
		System.out.println("this is default method");
	}
	
}
