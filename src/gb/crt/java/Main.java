package gb.crt.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Application entry point.
 * 
 * @author Gage Berghoff
 */
public class Main extends Application {

	/**************************
	 * Constants
	 **************************/

	public static final String APPLICATION_NAME = "Cigar-Review-Tracker";

	/**************************
	 * Methods
	 **************************/

	
	/**
	 * Application entry point.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("*********************************");
		System.out.println("* Starting " + APPLICATION_NAME);
		System.out.println("*********************************");

		Parent root = FXMLLoader.load(getClass().getResource("/gb/crt/resources/views/MainView.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("/gb/crt/resources/css/stylesheet.css");
		primaryStage.setTitle(APPLICATION_NAME);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}