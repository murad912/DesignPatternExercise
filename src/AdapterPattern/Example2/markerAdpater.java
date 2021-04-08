package AdapterPattern.Example2;

public class markerAdpater implements Pen {
	
	private marker m1;
	
	public markerAdpater() {
		m1 = new marker();
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		m1.markerType();
	}

	@Override
	public void write(String s) {
		// TODO Auto-generated method stub
		m1.brush(s);
	}

}
