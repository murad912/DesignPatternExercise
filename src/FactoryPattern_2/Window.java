package FactoryPattern_2;

public class Window implements OS {

	@Override
	public void model() {
		System.out.println("I'm Window");

	}
	void version() {
		System.out.println("Window 10 ultimate");
	}

}
