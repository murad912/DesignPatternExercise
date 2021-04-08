package CommandPattern;

import java.util.List;

public class TurnItAllOff implements Command {
	List<ElectronicDevice> theDevice;
	public TurnItAllOff(List<ElectronicDevice> newDevice) {
		theDevice = newDevice;
	}
	@Override
	public void execute() {
		for(ElectronicDevice device : theDevice) {
			device.off();
		}

	}
	public void undo() {
		for(ElectronicDevice device : theDevice) {
			device.on();
		}

	}

}
