package designpatterns.factory.test1;

public class DonutChart extends Chart {

	@Override
	public void generatePNGImage() {
		System.out.println("Logic to generate PNG image of the donut chart");
	}
}
