package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

public class MainController {
	
	@FXML LineChart<String, Number> lineChart;
	@FXML Button loadChart;
	
	public void btn(ActionEvent event) {
		lineChart.getData().clear();
		XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
		series.getData().add(new XYChart.Data<String, Number>("Jan",200));
		series.getData().add(new XYChart.Data<String, Number>("Feb",100));
		series.getData().add(new XYChart.Data<String, Number>("Mar",150));
		series.getData().add(new XYChart.Data<String, Number>("Apr",200));
		series.getData().add(new XYChart.Data<String, Number>("May",300));
		series.getData().add(new XYChart.Data<String, Number>("Jun",550));
		series.getData().add(new XYChart.Data<String, Number>("Jul",600));
		series.setName("Pay 1");
		
		XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
		series1.getData().add(new XYChart.Data<String, Number>("Jan",240));
		series1.getData().add(new XYChart.Data<String, Number>("Feb",250));
		series1.getData().add(new XYChart.Data<String, Number>("Mar",220));
		series1.getData().add(new XYChart.Data<String, Number>("Apr",300));
		series1.getData().add(new XYChart.Data<String, Number>("May",400));
		series1.getData().add(new XYChart.Data<String, Number>("Jun",550));
		series1.getData().add(new XYChart.Data<String, Number>("Jul",575));
		series1.setName("Pay 2");
		
		XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
		series2.getData().add(new XYChart.Data<String, Number>("Jan",400));
		series2.getData().add(new XYChart.Data<String, Number>("Feb",300));
		series2.getData().add(new XYChart.Data<String, Number>("Mar",220));
		series2.getData().add(new XYChart.Data<String, Number>("Apr",300));
		series2.getData().add(new XYChart.Data<String, Number>("May",300));
		series2.getData().add(new XYChart.Data<String, Number>("Jun",520));
		series2.getData().add(new XYChart.Data<String, Number>("Jul",500));
		series2.setName("Pay 3");
		
		XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
		series3.getData().add(new XYChart.Data<String, Number>("Jan",300));
		series3.getData().add(new XYChart.Data<String, Number>("Feb",285));
		series3.getData().add(new XYChart.Data<String, Number>("Mar",400));
		series3.getData().add(new XYChart.Data<String, Number>("Apr",450));
		series3.getData().add(new XYChart.Data<String, Number>("May",400));
		series3.getData().add(new XYChart.Data<String, Number>("Jun",550));
		series3.getData().add(new XYChart.Data<String, Number>("Jul",500));
		series3.setName("Pay 4");
		
		lineChart.getData().addAll(series,series1,series2,series3);
	}

}
