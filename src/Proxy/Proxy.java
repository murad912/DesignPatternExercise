package Proxy;

public class Proxy implements Subject {
	private Subject subject;
	
	public Proxy(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void request() {
		System.out.println("Before entering the method");
		subject.request();
		System.out.println("After entering the method");
	}

}
