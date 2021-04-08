package CommandPattern;

public class TurnTvOff implements Command {
	ElectronicDevice theDevice; //this class need to know which device is performing 
	
	public TurnTvOff(ElectronicDevice newDevice) {
		super();
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.off();

	}
	public void undo() {
		theDevice.on();
		
	}
}
