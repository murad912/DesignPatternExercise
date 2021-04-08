package DecoratorEx2;

public class Mozzarlla extends ToppingDecorator {

	public Mozzarlla(Pizza tempPizza) {
		super(tempPizza);

		System.out.println("Adding Dough");
		System.out.println("Adding Moz");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Mozzrella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}
