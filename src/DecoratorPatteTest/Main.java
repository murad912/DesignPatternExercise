package DecoratorPatteTest;

public class Main {
	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Animal colorCat = new ColorDecorator(new Cat());
		Animal colorDog = new ColorDecorator(new Dog());
		
		System.out.println("Cat without Color");
		cat.display();
		System.out.println("---------------------------------------");
		colorCat.display();
		
		colorDog.display();
		Animal dog = new Dog();
		
		System.out.println("----------------------------------------");
		System.out.println("dog with out Color");
		dog.display();
		
	}
	

}
