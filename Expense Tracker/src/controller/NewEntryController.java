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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

	
	@FXML
    void cancel(ActionEvent event) 
	{
		((Stage) price.getScene().getWindow()).close();
    }

    @FXML
    void save(ActionEvent event) 
    {
    	
    }
	
}




















