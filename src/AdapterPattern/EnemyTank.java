package AdapterPattern;
import java.util.Random;

public class EnemyTank implements EnemyAttacker { 
 Random generator = new Random();
	@Override
	public void fireweapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("enemy Tank Does " + attackDamage  + " Damege");

	}

	@Override
	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Tank move " + movement + " spaces");

	}

	@Override
	public void assignDriver(String driverName) {
		
		System.out.println(driverName + "is driving the tank ");

	}

}
