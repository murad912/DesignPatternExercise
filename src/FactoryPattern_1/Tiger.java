package FactoryPattern_1;

public class Tiger implements Animal{

    private String name;

    Tiger(String name){
        this.name = name;
    }


    public void animalType() {
        System.out.println("Tiger: Wild animal");
    }

    public void soundType() {
        System.out.println("Roar");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
