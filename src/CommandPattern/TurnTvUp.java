package CommandPattern;

public class TurnTvUp implements Command {
	ElectronicDevice theDevice; //this class need to know which device is performing 
	
	public TurnTvUp(ElectronicDevice newDevice) {
		super();
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.volumeUp();

	}
	public void undo() {
		theDevice.volumeDown();
		
	}

}