package DecoratorPatteTest;

public abstract class AnimalDecorator implements Animal {

	public Animal DecoratorAnimal;
	
	public AnimalDecorator(Animal decoratorAnimal) {
		super();
		DecoratorAnimal = decoratorAnimal;
	}

	public void display() {
		DecoratorAnimal.display();

	}

}
