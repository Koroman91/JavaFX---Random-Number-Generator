package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class MainController {
	@FXML
    private Label MyMessage;
	
	public void generateRandom(ActionEvent ev)
	{
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1; 
		MyMessage.setText(Integer.toString(myrand));
		System.out.println(Integer.toString(myrand));
	}

}
