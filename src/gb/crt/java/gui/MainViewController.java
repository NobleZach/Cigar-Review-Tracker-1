package gb.crt.java.gui;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.TextFields;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * The controller class for the main view
 * 
 * @author Gage Berghoff
 */
public class MainViewController implements Initializable {

	@FXML
	private TextField brandTf;

	private String[] brandNames = { "Gage", "nobal", "geroge", "test", "geroge", "Gage", "nobal", "geroge", "test",
			"geroge", "Gage", "nobal", "geroge", "test", "geroge", "Gage", "nobal", "geroge", "test", "geroge" };

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TextFields.bindAutoCompletion(brandTf, brandNames);
	}
}