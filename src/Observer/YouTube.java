package Observer;

public class YouTube {

	public static void main(String[] args) {

		Channel mur = new Channel();
		
		Subscriber s1 = new Subscriber("Murad");
		Subscriber s2 = new Subscriber("Yonnas");
		Subscriber s3 = new Subscriber("John");
		Subscriber s4 = new Subscriber("Yomi");
		Subscriber s5 = new Subscriber("Henery");
		
				
		mur.subscribe(s1);
		mur.subscribe(s2);
		mur.subscribe(s3);
		mur.subscribe(s4);
		mur.subscribe(s5);
		
		mur.unSubsccribe(s4); //Yomi will delete or unSubscribe
		
		s1.subscribeChannel(mur);
		s2.subscribeChannel(mur);
		s3.subscribeChannel(mur);
		s4.subscribeChannel(mur);
		s5.subscribeChannel(mur);
		
		mur.upload("how to learn proggramming!");

	}

}
