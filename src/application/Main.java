package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
	
		try {
			
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/View/Location.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();
			primaryStage.setTitle("Location");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}	
