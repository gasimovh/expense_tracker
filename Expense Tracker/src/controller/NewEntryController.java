package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NewEntryController implements Initializable {
	
	@FXML
    private JFXTextField merchant;

    @FXML
    private JFXTextField price;

    @FXML
    private JFXDatePicker datePicker;

    @FXML
    private JFXComboBox<?> category;
    
//    private MainPageController mpc;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//mpc.getContent().getParent().getParent()).setEffect(new BoxBlur(2, 2, 2)
		//((Node) mpc.getContent().getParent().getParent()).setEffect(new BoxBlur(2, 2, 2));
		
		
//		mpc = new MainPageController();
//		mpc.setBoxBlurEffect();
		
		
//		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MainPage.fxml"));
//			Parent parent = loader.load();
//			MainPageController mpc = (MainPageController) loader.getController();
//			//mpc.setBoxBlurEffect();
//			mpc.getBorderPane().setEffect(new BoxBlur(2, 2, 2));
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

	
	@FXML
    void cancel(ActionEvent event) 
	{
		((Stage) price.getScene().getWindow()).close();
		//((Node) mpc.getContent().getParent().getParent()).setEffect(new BoxBlur(0, 0, 0));
    }

    @FXML
    void save(ActionEvent event) 
    {
    	
    }
	
}




















