package controller;

import config.Rooting;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class LocationController {
	
	  @FXML
	    private BorderPane main;

	    @FXML
	    void addLocation(ActionEvent event) {
	    	
	    	Parent root =FXML.Loade(getClass().getResource( "/view/" + Rooting.ADDLOCATION));
	    	
	    	main.setCenter(root);

	    }

	    @FXML
	    void searchLocation(ActionEvent event) {

Parent root =FXML.Loade(getClass().getResource( "/view/" + Rooting.LISTELOCATION));
	    	
	    	main.setCenter(root);
	    }

}
