package MethodReference;

public class StaticRefrence implements DemoSatic {

	@Override
	public void Say() {
		System.out.println("Hi this is Say method");
	}

	static void run() {
		System.out.println("this is run method");
	}

	public static void main(String[] args) {

		StaticRefrence d = new StaticRefrence();
		d.Say();

		DemoSatic ref = StaticRefrence::run; // by using method refernce.....
		ref.Say();

		DemoSatic.diplay(); /// we can call using class name

	}
}
