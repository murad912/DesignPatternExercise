package FactoryPattern_1;

public class TigerFactory implements AnimalFacoryClass{

	@Override
	public Animal getInstance(String type) {
	
		if(type.equalsIgnoreCase("wild")) {
			return new Tiger("ken");
			}else {
				return null;
			}
	}

}
