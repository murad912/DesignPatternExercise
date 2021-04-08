package ObserverEx2;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();

	      Observer hexaObserver = new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(20);
	      
	      subject.deattach(hexaObserver);
	      System.out.println("Third state change: 5"); 
	      subject.setState(5);
	   }
}
