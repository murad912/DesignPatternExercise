package Facade.Facae2.FacadeSelfCheck;

public class AnimaFacade {
	private Dog dog;
	private Cat cat;
	private Bird bird;
	public AnimaFacade(){
		dog= new  Dog();
		cat = new Cat();
		bird = new Bird();
	}
	public void catType() {
		cat.sound();
		cat.type();
	}
	public void dogType() {
		dog.sound();
		dog.type();
	}
	public void birdType() {
		bird.sound();
		bird.type();
	}
}
