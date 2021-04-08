package AdapterPattern.Example2;

public class pencilAdapter implements Pen {
	
	private pencil pencil;
	
	public pencilAdapter(){
		pencil = new pencil();
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		pencil.pncilType();
	}

	@Override
	public void write(String s) {
		// TODO Auto-generated method stub
		pencil.color(s);
	}

}
