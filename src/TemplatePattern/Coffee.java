package TemplatePattern;

public class Coffee extends CaffeeineBeverage{

	@Override
	void brew() {
		System.out.println("Dripping Coffe");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
		
	}

}
