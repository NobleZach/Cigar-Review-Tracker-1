package gb.crt.java;

import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Application entry point.
 * 
 * @author Gage Berghoff
 */
public class Main extends Application {

	/**************************
	 * Fields
	 **************************/
	private Stage primaryStage;
	private Preferences pref = Preferences.userRoot().node(this.getClass().getName());

	/**************************
	 * Constants
	 **************************/
	// Application constants
	public static final String APPLICATION_NAME = "Cigar-Review-Tracker";

	// Preference constants
	private static final String WINDOW_POSITION_X = "Window_Position_X";
	private static final String WINDOW_POSITION_Y = "Window_Position_Y";
	private static final String WINDOW_WIDTH = "Window_Width";
	private static final String WINDOW_HEIGHT = "Window_Height";
	private static final double DEFAULT_X = 10;
	private static final double DEFAULT_Y = 10;
	private static final double DEFAULT_WIDTH = 800;
	private static final double DEFAULT_HEIGHT = 600;

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

		Parent root = FXMLLoader.load(getClass().getResource("/gb/crt/java/gui/MainView.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("/gb/crt/resources/css/stylesheet.css");
		primaryStage.setTitle(APPLICATION_NAME);
		primaryStage.getIcons().add(new Image("/gb/crt/resources/icons/ApplicationIcon.png"));
		primaryStage.setScene(scene);
		primaryStage.show();

		// Load previous sessions window cords and size from preferences.
		primaryStage.setX(pref.getDouble(WINDOW_POSITION_X, DEFAULT_X));
		primaryStage.setY(pref.getDouble(WINDOW_POSITION_Y, DEFAULT_Y));
		primaryStage.setWidth(pref.getDouble(WINDOW_WIDTH, DEFAULT_WIDTH));
		primaryStage.setHeight(pref.getDouble(WINDOW_HEIGHT, DEFAULT_HEIGHT));

		this.primaryStage = primaryStage;
	}

	@Override
	public void stop() {
		// Saving window cords and size to preferences.
		pref.putDouble(WINDOW_POSITION_X, primaryStage.getX());
		pref.putDouble(WINDOW_POSITION_Y, primaryStage.getY());
		pref.putDouble(WINDOW_WIDTH, primaryStage.getWidth());
		pref.putDouble(WINDOW_HEIGHT, primaryStage.getHeight());
	}
}