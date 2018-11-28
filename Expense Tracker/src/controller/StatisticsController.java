package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import model.DoughnutChart;

public class StatisticsController implements Initializable{

	@FXML
	private Pane pane;
	
	@FXML
	private PieChart chart;
	
//	@FXML
//	private Label caption;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		//showPercentage();
		showPieChart();
		
	}
	
	public void showPieChart()
	{
		ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Groceries", 13),
                new PieChart.Data("Entertainment", 25),
                new PieChart.Data("Food", 10),
                new PieChart.Data("Drink", 22),
                new PieChart.Data("Rent", 30));
		chart = new DoughnutChart(pieChartData);
        //chart.setTitle("Daily");
        pane.getChildren().add(chart);
        
        chart.setLabelLineLength(10);
        chart.setLegendSide(Side.RIGHT);
	}
	

    @FXML
    void daily(ActionEvent event) {
    	showPieChart();
    }

    @FXML
    void graph(ActionEvent event) {
    	
    }
	
//	public void showPercentage() {
//		caption.setTextFill(Color.rgb(241, 239, 244));
//		caption.setStyle("-fx-font: 14 arial;");
//		// caption.layoutXProperty().bind(chart.widthProperty().subtract(caption.widthProperty()).divide(2));
//		// caption.layoutYProperty().bind(chart.heightProperty().subtract(caption.heightProperty()).divide(2));
//		for (PieChart.Data data : chart.getData()) {
//			data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
//				@Override
//				public void handle(MouseEvent e) {
//					// caption.setTranslateX(e.getSceneX());
//					// caption.setTranslateY(e.getSceneY());
//					caption.setText(String.valueOf(data.getPieValue()) + "%");
//					// System.out.println(e.getSceneX() + "***" + e.getSceneY());
//				}
//			});
//		}
//	}

}
