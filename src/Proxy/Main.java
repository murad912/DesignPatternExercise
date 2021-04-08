package Proxy;

public class Main {

	public static void main(String[] args) {
	Subject subject = new RealSubject();
	subject.request(); //this call original method
	
	System.out.println("\n---------------------\n");
	subject = new Proxy(subject);
	subject.request(); //this call through proxy
	
	//Subject subject1 = new Proxy(new RealSubject()); //or we can call this way 
	

	}

}
