package designpatterns.factory.test1;

public class PieChart extends Chart {

	@Override
	public void generatePNGImage() {
		System.out.println("Logic to generate PNG image of the pie chart");
	}
}
