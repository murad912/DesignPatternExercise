package TemplatePattern;

public abstract class CaffeeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Bioling Water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into Cup ");
	}
}
