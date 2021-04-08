package AdapterPattern.Example2;

public class BicPen implements Pen {

	@Override
	public void getType() {
		System.out.println("This is a Bic pen");
	}

	@Override
	public void write(String s) {
		System.out.println(s);
	}

}
