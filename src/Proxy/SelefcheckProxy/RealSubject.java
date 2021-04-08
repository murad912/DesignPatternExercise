package Proxy.SelefcheckProxy;

public class RealSubject implements Subject {
	
	private int value;
	
	public RealSubject(int value) {
		super();
		this.value = value;
		moneyChange(value);
	}

	private void moneyChange(int value) {
		if(value >= 100) {
			System.out.println("my value is greater than 100: " + value);
		}else {
		System.out.println("my value is less than 100: " + value);
		}
	}

	@Override
	public void show() {
		System.out.println("this method is from RealSubject");
		
	}

}
