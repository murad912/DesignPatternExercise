package AdapterPattern.Example2;

public class PilotPen implements Pen{

	@Override
	public void getType() {
		System.out.println("This is a pilot pen");
	}

	@Override
	public void write(String s) {
		System.out.println(s);
	}

}
