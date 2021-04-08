package DecoratorEx2;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza basicPizza = new TomatoSauce(new Mozzarlla(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
		
	}

}
