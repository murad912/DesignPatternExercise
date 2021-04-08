package DecorateSelfCheck;

public class PersonStatusTwo extends DecolratePerson{

	public PersonStatusTwo(Person personDecorate) {
		super(personDecorate);
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		personDecorate.show();
		addStatus(personDecorate);
	}
	public void addStatus(Person personDecorate) {
		System.out.println("I'm Instructor and have Green card");
	}
}
