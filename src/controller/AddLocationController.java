package controller;

import java.awt.TextArea;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class AddLocationController  implements Initializable {
	
	
	 @FXML
	    private TextField matriculeTfd;

	    @FXML
	    private TextField numocrtTfd;

	    @FXML
	    private ComboBox<?> couleurCbx;

	    @FXML
	    private ComboBox<?> marqueCbx;

	    @FXML
	    private TextField nbPlacesTfd;

	    @FXML
	    private ComboBox<?> modelCbx;

	    @FXML
	    private TextField numPieceTfd;

	    @FXML
	    private TextField nomTfd;

	    @FXML
	    private TextField prenomTfd;

	    @FXML
	    private TextField telephoneTfd;

	    @FXML
	    private DatePicker datenaissDpk;

	    @FXML
	    private DatePicker dateLocDpk;

	    @FXML
	    private TextField montantLocTfd;

	    @FXML
	    private TextArea commentateTar;

	    @FXML
	    void handleSave(ActionEvent event) {

	    }
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
