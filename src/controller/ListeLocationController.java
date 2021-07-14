package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListeLocationController implements Initializable {
	
	
	  @FXML
	    private TableView<?> locTable;

	    @FXML
	    private TableColumn<?, ?> date_column;

	    @FXML
	    private TableColumn<?, ?> mate_column;

	    @FXML
	    private TableColumn<?, ?> numcrt_column;

	    @FXML
	    private TableColumn<?, ?> nom_column;

	    @FXML
	    private TableColumn<?, ?> prenom_column;

	    @FXML
	    private TableColumn<?, ?> montant_column;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
