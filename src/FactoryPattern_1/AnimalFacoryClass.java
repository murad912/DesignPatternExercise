 package FactoryPattern_1;

public interface AnimalFacoryClass {

    public abstract Animal getInstance(String type);
    
    public default Animal getAnimal(String s) {
    	
    	Animal animal  = getInstance(s);

    	
    	return animal;
    }
    
    

}
