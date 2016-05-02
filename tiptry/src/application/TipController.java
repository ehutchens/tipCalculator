package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TipController {
	//Samm was here.
	
	@FXML 
	private TextField amountTextField;
	
	@FXML 
	private TextField totalTextField;
	
	@FXML 
	private void calculateButtonPressed(ActionEvent event) {
		Float mealAmount = Float.parseFloat(amountTextField.getText());
		//20% increase
		totalTextField.setText(String.valueOf(mealAmount * (1 + .40))); //change
	}
	
}
