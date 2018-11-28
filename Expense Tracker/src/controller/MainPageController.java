package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainPageController implements Initializable {

	@FXML
	private Pane content;
	
	@FXML
	private BorderPane borderPane;

	@FXML
	private FontAwesomeIconView power;

	//able to move the dialog
	private double xOffset = 0;
	private double yOffset = 0;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		showOverview();

		Alert alert = new Alert(AlertType.CONFIRMATION,
				"You are about to close the application. Are you sure to continue?", ButtonType.YES, ButtonType.NO);
		alert.initStyle(StageStyle.UNDECORATED);
		//alert.setHeaderText(null);
		alert.setGraphic(null);//remove the question mark graphic

		// get dialog pane to style the alert in css
		DialogPane dialogPane = alert.getDialogPane();
		dialogPane.getStylesheets().add(getClass().getResource("../view/appDialogs.css").toExternalForm());
		dialogPane.getStyleClass().add("myDialog");

		// able to move the dialog
		dialogMove(dialogPane);
		dialogGrab(dialogPane);

		power.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				//add blur effect
				setBoxBlurEffect();
				alert.showAndWait();
				if (alert.getResult() == ButtonType.YES) {
					((Stage) content.getScene().getWindow()).close();
				}else 
				{
					//remove blur effect
					removeBoxBlurEffect();
				}

			}
		});

	}

	@FXML
	public void showOverview() {
		content.getChildren().clear();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Overview.fxml"));
			Parent root = loader.load();
			content.getChildren().add(root);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void showStatistics() {
		content.getChildren().clear();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Statistics.fxml"));
			Parent root = loader.load();
			content.getChildren().add(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void showBudget() {
		content.getChildren().clear();
	}

	@FXML
	public void showEvents() {
		content.getChildren().clear();
	}

	public void dialogMove(DialogPane dp) {
		dp.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				((Stage) dp.getScene().getWindow()).setX(event.getScreenX() - xOffset);
				((Stage) dp.getScene().getWindow()).setY(event.getScreenY() - yOffset);
			}
		});
	}

	public void dialogGrab(DialogPane dp) {
		dp.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});
	}

	public void setBoxBlurEffect() {
		borderPane.setEffect(new BoxBlur(2, 2, 2));
	}
	
	public void removeBoxBlurEffect() {
		borderPane.setEffect(new BoxBlur(0, 0, 0));
	}
	
//	public BorderPane getBorderPane() {
//		System.out.println("This method is called!");
//		return borderPane;
//	}

}






//CSS for appDialog
//.dialog-pane{
//	  -fx-border-color:black;
//	  -fx-border-width:2.0px;
//	 }
//
//	/**Costumization of The Bar where the buttons are located**/
//	.dialog-pane > .button-bar > .container {
//	  -fx-background-color:black;
//	}
//
//	.dialog-pane > .content.label {
//	   -fx-padding: 0.5em 0.5em 0.5em 0.5em;
//	   -fx-background-color: yellow;
//	   -fx-text-fill:black;
//	   -fx-font-size:15.0px;
//	}
//
//	/**Costumization of DialogPane Header**/
//	.dialog-pane:header .header-panel {
//	  -fx-background-color: black;
//	}
//
//	.dialog-pane:header .header-panel .label{
//	  -fx-background-color: yellow;
//	  -fx-background-radius:10px;
//	  -fx-text-fill:black;
//	  -fx-font-size:15.0px;
//	}
//
//
//	/**Costumization of Buttons**/
//	.dialog-pane .button{
//	   -fx-background-color:black;
//	   -fx-text-fill:white;
//	   -fx-wrap-text: true;
//	   -fx-effect: dropshadow( three-pass-box, yellow, 10.0, 0.0, 0.0, 0.0);
//	   -fx-cursor:hand;
//	 }
//
//	.dialog-pane .button:hover{     
//	  -fx-background-color:white;
//	  -fx-text-fill:black;
//	  -fx-font-weight:bold; 
//	 }
