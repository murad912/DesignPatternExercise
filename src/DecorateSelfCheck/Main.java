package DecorateSelfCheck;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		Person p1 = new PersonStatus(new Student());
		p1.show();
		
		Person p2 = new PersonStatusTwo(new Instructor());
		p2.show();
		

	}

}
