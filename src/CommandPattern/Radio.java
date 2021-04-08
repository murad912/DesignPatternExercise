package CommandPattern;

public class Radio implements ElectronicDevice {
	private int volume = 0;
	@Override
	public void on() {
		System.out.println("Radio on"); 

	}

	@Override
	public void off() {
		System.out.println("Radio off"); 

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Radio volume is att " + volume); 

	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Radio volume is att " + volume); 

	}


}
