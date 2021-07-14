package controller;

import java.net.URL;

import config.Rooting;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class LocationController {
	
	  @FXML
	    private BorderPane main;

	    @FXML
	    void addLocation(ActionEvent event) {
	    	
	    	Parent root =FXMLLoader(getClass().getResource( "/view/" + Rooting.ADDLOCATION));
	    	
	    	main.setCenter(root);

	    }

	    @FXML
	    void searchLocation(ActionEvent event) {

Parent root =FXMLLoader(getClass().getResource( "/view/" + Rooting.LISTELOCATION));
	    	
	    	main.setCenter(root);
	    }

		private Parent FXMLLoader(URL resource) {
			// TODO Auto-generated method stub
			return null;
		}

}
