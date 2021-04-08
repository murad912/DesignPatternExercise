package FactoryPattern_1;

public class DogFactory implements AnimalFacoryClass{

	@Override
	public Animal getInstance(String type) {
		
		if(type.equalsIgnoreCase("domestic")) {
			return new dog("ben");
		}else {
			return null;
		}
	}

}
