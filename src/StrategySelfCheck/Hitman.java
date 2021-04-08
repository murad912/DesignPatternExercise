package StrategySelfCheck;

public abstract class Hitman {
	RollBehaviour rollB;
	Waponbehaviour wepB;
	
	public Hitman() {
	}
	
	void performRoll() {
		rollB.roll();
	}
	void performWeapon() {
		wepB.weapon();
	}

	public void setRollB(RollBehaviour rollB) {
		this.rollB = rollB;
	}


	public void setWepB(Waponbehaviour wepB) {
		this.wepB = wepB;
	}

	abstract void kick();
	abstract void jump();

	void repair() {
		System.out.println("I'm Repaire my weapon !");
	}
}
