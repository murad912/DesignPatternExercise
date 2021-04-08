package StrategySelfCheck;

public class Xoxo extends Hitman {
	public Xoxo() {
		rollB = new GroundRoll();
		wepB= new Sword();
	}

	@Override
	void kick() {
		System.out.println("I'm Xoxo I can kick!");
		
	}

	@Override
	void jump() {
		System.out.println("I can jump Midum!");
		
	}

}
