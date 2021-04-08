package DecoratorPatteTest;

public class ColorDecorator extends AnimalDecorator{

	public ColorDecorator(Animal decoratorAnimal) {
		super(decoratorAnimal);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		DecoratorAnimal.display();
		myColor(DecoratorAnimal);
	}
	private void myColor(Animal decoratorAnimal) {
		System.out.println("I'm A White Color");
		
	}

}
