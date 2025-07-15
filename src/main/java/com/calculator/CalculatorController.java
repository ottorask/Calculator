package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * Controller class for the calculator FXML interface
 */
public class CalculatorController {
    
    @FXML
    private TextField displayField;
    
    @FXML
    public void initialize() {
        // Initialize the display
        displayField.setText("0");
    }
    
    /**
     * Handle digit button clicks
     */
    @FXML
    private void handleDigitClick(MouseEvent event) {
        Button button = (Button) event.getSource();
        String digit = button.getText();
        
        // For now, just display the digit
        displayField.setText(digit);
    }
} 