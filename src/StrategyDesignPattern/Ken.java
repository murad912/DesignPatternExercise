package StrategyDesignPattern;

public class Ken extends Fighter{

	public Ken(){
		jum = new JumpStyle2();
		roll = new RollStyle1();
	}

	@Override
	void display() {
		System.out.println("I'm Ken");
	}

	@Override
	void punch() {
		System.out.println("I have ken punch");

	}

	@Override
	void Kik() {
		System.out.println("I have Ken kick");

	}

}
