package Proxy_2;

public class RealImageProxy implements RealImage {

	private String name;
	private RealImageImp real;

	public RealImageProxy(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("This is Proxy output");
		if(real==null) {
			real = new RealImageImp(name);
		}
	real.display();

	}

}
