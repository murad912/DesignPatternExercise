package AdapterPattern.Exercise3;

public class TurckyAdapter implements IDuck {
	private Turcky turk;
	
	public TurckyAdapter() {
		turk = new Turcky();
	}
	@Override
	public void quck() {
		turk.sound();

	}

	@Override
	public void fly() {
		turk.show();

	}

}
