package FactoryPattern_2;

public class OSFactory {
	public OS  getInstance(String s) {

		if(s.equalsIgnoreCase("first")) //first will open IOS class 
			return new IOS();
		else if(s.equalsIgnoreCase("second")) //second will open Andriod 
		return new Andriod();
		else
			return new Window(); //else will open window object

	}

}
