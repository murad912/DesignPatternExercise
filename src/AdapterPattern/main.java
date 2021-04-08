package AdapterPattern;

public class main {
	
	public static void main(String[] args) {
		
		EnemyTank r1 = new EnemyTank();
		
		EnemyRobot fr1 = new EnemyRobot();
		
		EnemyAttacker rAdapter = new EnemyRobotAdapter(fr1);
		
		System.out.println("the robot");
		
		fr1.reactToHuman("paul");
		fr1.walkForward();
		fr1.smashWithHand();
		
		System.out.println("the enemy tank");
		
		r1.assignDriver("frank");
		r1.driveForward();
		r1.fireweapon();
		
		System.out.println("the adapter");
		
		rAdapter.assignDriver("mark");
		rAdapter.driveForward();
		rAdapter.fireweapon();
		
	}

}
