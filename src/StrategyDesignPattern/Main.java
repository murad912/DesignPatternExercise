package StrategyDesignPattern;

public class Main {
	
	public static void main(String[] args) {
		Fighter f1 = new Ryu();
		f1.perfomRoll();
		f1.perfomJum();
		f1.display();
		f1.Kik();
		
		Fighter f2 = new Ken();
		f2.perfomJum();
		f2.setJum(new JumpStyle1()); //this will change jump style dynamically 
		f2.perfomJum();
	}

}
