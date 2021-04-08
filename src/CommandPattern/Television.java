package CommandPattern;

public class Television implements ElectronicDevice {
	private int volume = 0;
	@Override
	public void on() {
		System.out.println("Tv on"); 

	}

	@Override
	public void off() {
		System.out.println("Tv off"); 

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Tv volume is att " + volume); 

	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Tv volume is att " + volume); 

	}

}
