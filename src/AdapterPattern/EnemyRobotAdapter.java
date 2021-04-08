package AdapterPattern;

public class EnemyRobotAdapter implements EnemyAttacker {
	
	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot theRobot) {
		super();
		this.theRobot = theRobot;
	}

	@Override
	public void fireweapon() {
		theRobot.smashWithHand();

	}

	@Override
	public void driveForward() {
		this.theRobot.walkForward();

	}

	@Override
	public void assignDriver(String driverName) {
		this.theRobot.reactToHuman(driverName);

	}

}
