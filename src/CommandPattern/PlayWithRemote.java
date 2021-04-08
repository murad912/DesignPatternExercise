package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		TurnTvOn onCommand = new TurnTvOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();

		//------------------------------------------------

		TurnTvOff offCommand = new TurnTvOff(newDevice);
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		//---------------------------------------
		TurnTvUp volUpCommand = new TurnTvUp(newDevice);
		onPressed = new DeviceButton(volUpCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		//--------------------------------------------
		
		Television theTv = new Television();
		Radio theRadio = new Radio();
		List<ElectronicDevice> allDevice = new ArrayList<ElectronicDevice>();
		allDevice.add(theTv);
		allDevice.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevice);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
		//----------------------------------------
		
		turnThemOff.pressUndo();
	}
}
