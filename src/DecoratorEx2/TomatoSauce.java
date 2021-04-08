package DecoratorEx2;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza tempPizza) {
		super(tempPizza);

		System.out.println("Adding Sauce");
		
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", TomatoSauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .35;
	}
}
