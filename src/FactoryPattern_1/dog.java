package FactoryPattern_1;

public class dog implements Animal{

    private String name;

    dog(String name){
        this.name = name;
    }

    public void animalType() {
        System.out.println("Dog : Domestic Animal");
    }

    public void soundType() {
        System.out.println("Bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
