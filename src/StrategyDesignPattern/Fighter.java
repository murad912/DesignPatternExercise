package StrategyDesignPattern;

public abstract class Fighter{ 
	
	Jumper jum; //calling Jumper interface 
	Roller roll; //calling Roller interface 
	
	public Fighter() {
		super();
	}
	
	public void perfomJum(){
		jum.jump();
	}
	public void perfomRoll() {
		roll.roll();
	}
	public void setJum(Jumper jum) { //setter for Jumper
		this.jum = jum;
	}
	public void setRoll(Roller roll) { //setter for Roller
		this.roll = roll;
	}
	abstract void display();
	abstract void Kik();
	abstract void punch();

	void compeletMethod() {
		System.out.println("This is composition test methed!");
	}
}
