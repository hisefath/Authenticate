/* Author :: MasterShefu
 * [UB SEDS     3.14.18]
 * 
 * Graphing tool for acceleration, velocity, altitude of Rocket
 */
package org.ubseds.irac.ground_control;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class graphingModel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		init(primaryStage);
	}
	
	private void init(Stage primaryStage) {
		HBox root = new HBox();
		Scene scene = new Scene(root, 450, 330);
		
		NumberAxis xAxis = new NumberAxis();
		xAxis.setLabel("Seconds");
		
		NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Altitude");
		
		LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);
		lineChart.setTitle("Flight Computer Data");
		
		XYChart.Series<Number, Number> data = new XYChart.Series<>();
		data.getData().add(new XYChart.Data<Number, Number>(0, 0));
		data.getData().add(new XYChart.Data<Number, Number>(1, 5));
		data.getData().add(new XYChart.Data<Number, Number>(2, 10));
		data.getData().add(new XYChart.Data<Number, Number>(3, 20));
		data.getData().add(new XYChart.Data<Number, Number>(4, 35));
		data.getData().add(new XYChart.Data<Number, Number>(5, 50));
		
		lineChart.getData().add(data);
		root.getChildren().add(lineChart);
		
		primaryStage.setTitle("Altitude per Second");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
