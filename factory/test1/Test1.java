package designpatterns.factory.test1;

import designpatterns.factory.test1.ChartFactory.ChartType;

public class Test1 {

	public static void main(String[] args) {
		// This is a real example (without the terrible amount of code) which I've found during one of my
		// implementations. A PDF generator needs to paint a chart which, depending on the information
		// the user stored when managing the data, has a different visual style. So we can use the Factory
		// pattern to better bring the concrete implementation of each graphic chart.

		Chart columnChart = ChartFactory.getChart(ChartType.COLUMN);
		Chart barChart = ChartFactory.getChart(ChartType.BAR);
		Chart pieChart = ChartFactory.getChart(ChartType.PIE);
		Chart donutChart = ChartFactory.getChart(ChartType.DONUT);

		columnChart.generatePNGImage();
		barChart.generatePNGImage();
		pieChart.generatePNGImage();
		donutChart.generatePNGImage();
	}
}
