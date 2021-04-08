package StrategyDesignPattern;

public class Ryu extends Fighter{
	
	public Ryu() {
		
		jum = new JumpStyle1();
		roll = new RollStyle2();
	}

	@Override
	void display() {
		System.out.println("I'm Ryu");
	}
	
	@Override
	void punch() {
		System.out.println("I have Ryu punch");
		
	}
	
	@Override
	void Kik() {
		System.out.println("I have Ryu kick");
		
	}
	
}
