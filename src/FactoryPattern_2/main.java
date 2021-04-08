package FactoryPattern_2;

public class main {

	public static void main(String[] args) {
		OSFactory obj = new OSFactory(); //this factory help us to hide object from the user 
		
		OS obj2 = obj.getInstance("first");
		obj2.model();
		
		OS win = obj.getInstance("123");
		win.model();
		
	}

}
