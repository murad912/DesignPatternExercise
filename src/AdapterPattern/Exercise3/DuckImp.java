package AdapterPattern.Exercise3;

public class DuckImp implements IDuck {

	@Override
	public void quck() {
		System.out.println("I'm Duck and I can Quick");

	}

	@Override
	public void fly() {
		System.out.println("I'm Duck and I can Fly");

	}

}
