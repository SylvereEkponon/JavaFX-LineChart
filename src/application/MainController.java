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
		series.setName("Month Pay");
		lineChart.getData().add(series);
	}

}
