package designpatterns.factory.test1;

import designpatterns.factory.test1.Chart;

public class ChartFactory {

	public enum ChartType {
		DONUT, PIE, BAR, COLUMN;
	}

	public static Chart getChart(ChartType chartType){
		switch ( chartType ) {
			case DONUT:
				return new DonutChart();
			case PIE:
				return new PieChart();
			case BAR:
				return new BarChart();
			case COLUMN:
				return new ColumnChart();
			default:
				return null;
		}
	}
}
