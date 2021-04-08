package DecorateSelfCheck;

public class PersonStatus extends DecolratePerson{

	public PersonStatus(Person personDecorate) {
		super(personDecorate);
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		personDecorate.show();
		addStatus(personDecorate);
	}

	private void addStatus(Person personDecorate) {
		System.out.println("I'm F-1 Visa Satus");
		
	}

}
