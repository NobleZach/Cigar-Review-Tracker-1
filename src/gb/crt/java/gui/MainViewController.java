package gb.crt.java.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.controlsfx.control.textfield.TextFields;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * The controller class for the main view
 *
 * @author Gage Berghoff
 *@author Zach Noble
 */
public class MainViewController implements Initializable {

	@FXML
	private TextField brandTf;

	private ArrayList<String> cigarBrands = new ArrayList<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cigarBrandPopulate();
		TextFields.bindAutoCompletion(brandTf, cigarBrands);
	}

	public void cigarBrandPopulate()
	{
            File file = new File("src/gb/crt/resources/autofill/Cigar_Brand_Names.txt");
            Scanner scanner;
			try {
				scanner = new Scanner(file);
				while (scanner.hasNext())
				{
					String line = scanner.nextLine();
				    cigarBrands.add(line);
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
}
