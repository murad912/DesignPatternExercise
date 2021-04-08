package DecoratorEx2;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;

	public ToppingDecorator(Pizza tempPizza) {
		super();
		this.tempPizza = tempPizza;
	}
	
	public String getDStringgetDescription() {
		return tempPizza.getDescription();
	}
	
	public double getCost() {
		return tempPizza.getCost();
	}
}
