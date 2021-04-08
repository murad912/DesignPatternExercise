package TemplatePattern;

public class Main {

	public static void main(String[] args) {
		CaffeeineBeverage caffe = new Tea();
		caffe.boilWater();
		caffe.brew();
		caffe.pourInCup();

	}

}
