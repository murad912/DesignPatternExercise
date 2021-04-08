package FactoryPattern_1;

public class Output {

    public static void main(String[] args) {

       AnimalFacoryClass factory = new DogFactory();
       
       Animal animal = factory.getAnimal("wild");
       
       animal.animalType();
       animal.soundType();
    }
}
