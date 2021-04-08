package CommandPattern;

public class TurnTvOn implements Command {
	ElectronicDevice theDevice; //this class need to know which device is performing 
	
	public TurnTvOn(ElectronicDevice newDevice) {
		super();
		this.theDevice = newDevice;
	}

	@Override
	public void execute() {
		theDevice.on();

	}

	@Override
	public void undo() {
		theDevice.off();
		
	}

}
