package AdapterPattern;
import java.util.Random;

public class EnemyRobot { 
	
	Random generator = new Random();
	
	public void smashWithHand() {
		int attackDamage = generator.nextInt(10)+1; 
		System.out.println("Enemy Robot Cause " + attackDamage + "Damage with Its Hand");

	}
	public void walkForward() {
		int movement = generator.nextInt(10) + 1;
		System.out.println("Enesmy Walks Forward " +  movement + " Spaces");

	}
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramp on " + driverName);
	}

}
