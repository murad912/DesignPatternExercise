package AdapterPattern.Example2;

public class write {

	
	public static void main(String[] args) {
		
		Pen p1 = new PilotPen();
		Pen p2 = new BicPen();
		Pen p3 = new pencilAdapter();
		Pen p4 = new markerAdpater();
		
		p1.getType();
		p1.write("written by pilot pen");
		
		p2.getType();
		p2.write("written by bic pen");
		
		p3.getType();
		p3.write("written by pencil with pencil adapter");
		
		p4.getType();
		p4.write("written by marker");
		
		
		
	}

}
