package StrategySelfCheck;

public class Main {

	public static void main(String[] args) {
	Hitman h = new Xoxo();
	h.jump();
	h.kick();
	h.repair();
	h.performRoll();
	h.performWeapon();
	h.setRollB(new AirRoll());
	h.performRoll();
		
	}

}
