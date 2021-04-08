package AdapterPattern.Exercise3;

import AdapterPattern.main;

public class Main {
	public static void main(String[] args) {
		IDuck d1 = new TurckyAdapter();
		d1.quck();
		d1.fly();
		
		
		System.out.println("This is the main Implimentation---------");
		d1 = new DuckImp();
		d1.quck();
		d1.fly();
	}

}
