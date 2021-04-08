package Proxy.SelefcheckProxy;


public class ProxySubject implements Subject {
	private int value;
	RealSubject rsubject;

	public ProxySubject(int value) {
		super();
		this.value = value;
	}

	@Override
	public void show() {
		if(rsubject==null) {
			rsubject = new RealSubject(value);		}
		rsubject.show();

	}

}


