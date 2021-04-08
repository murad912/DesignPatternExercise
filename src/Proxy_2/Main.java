package Proxy_2;

public class Main {

	public static void main(String[] args) {
		RealImage real = new RealImageImp("Video");
		real.display(); //this call only RealImage class
		
		RealImage proxy = new RealImageProxy("music");
		proxy.display();//this call is through proxy

	}

}
