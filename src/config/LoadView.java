package config;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public abstract class LoadView {
	
	private static Parent root;
	private static int type;
	
	private static BorderPane rootBorder;
	
	private static  Scene scene;
	private static  Stage stage;
	private static  String title;
	private static  String name;
	
	
	private static void  initStatge()
	{
		if (stage==null) {
			stage=new Stage();
		}
		
	}
	

	public static void showView(String titre,String  nom,int letype)
	{
		title=titre;
		name=nom;
		type = letype;
		initStatge();
		Load(type);
	}
	
	private static void Load (int type)
	{
		try {
			if(type == 1) {
				root=FXMLLoader.load(LoadView.class.getResource( "/view/"+name));
				scene=new Scene(root);
				stage.setScene(scene);
				stage.setTitle(title);
						//stage.initStyle(StageStyle.UTILITY);
				
				stage.centerOnScreen();
						stage.setResizable(false);
				//stage.initStyle(StageStyle.TRANSPARENT);
						showed();
			}
			  else if(type == 2) {
				root=FXMLLoader.load(LoadView.class.getResource( "/view/"+name));
				scene=new Scene(root);
				stage.setScene(scene);
				stage.setTitle(title);				
				stage.centerOnScreen();					
						
						showed();
		}
			  else {
				  root=FXMLLoader.load(LoadView.class.getResource( "/view/"));
				  rootBorder.setCenter(root);
			  }
					//stage.setResizable(false);
			
			  }catch (Exception e) {
				  e.printStackTrace();
			  }
		}
	
	private static void showed()
	
	{
		//stage.initStyle(StageStyle.UTILITY);
		stage.show();
	}
	
	
	public LoadView() {
		
	}



}


