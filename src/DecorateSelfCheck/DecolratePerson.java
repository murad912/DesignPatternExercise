package DecorateSelfCheck;

public abstract class DecolratePerson implements Person {

	Person personDecorate;
	
	
	public DecolratePerson(Person personDecorate) {
		super();
		this.personDecorate = personDecorate;
	}


	@Override
	public void show() {
		personDecorate.show();

	}

}
