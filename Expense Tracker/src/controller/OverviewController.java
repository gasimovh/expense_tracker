package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OverviewController implements Initializable{

	@FXML
	private ProgressBar progressBar, progressBar1, progressBar2, progressBar3;
	
	@FXML
	private Pane content;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		progressBar.setProgress(0.6);
		progressBar1.setProgress(0.3);
		progressBar2.setProgress(0.9);
		progressBar3.setProgress(0.1);
	}
	
    @FXML
    void addEntry(ActionEvent event)
    {
    	 try{
    		 	Parent root = FXMLLoader.load(getClass().getResource("../view/NewEntry.fxml"));

    			Scene scene = new Scene(root);

    			Stage stage = new Stage();

    			stage.initStyle(StageStyle.UNDECORATED);

    			stage.setScene(scene);

    			stage.show();

    			stage.setResizable(true);
           }catch(Exception e) {
        	   e.printStackTrace();
           }
    }

}
