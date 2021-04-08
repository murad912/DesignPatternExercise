package Proxy_2;

public class RealImageImp implements RealImage {
 private String name;
 
	public RealImageImp(String name) {
	super();
	this.name = name;
	loadFroDisk(name);
    }

	private void loadFroDisk(String name) {
		System.out.println("Loding....... " + name);
		
	}

	@Override
	public void display() {
		System.out.println("I'm Real Image class ! " + "file is: "+  name);

	}

}
