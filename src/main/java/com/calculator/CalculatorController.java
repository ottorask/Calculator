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
        displayField.setText("");
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
    
    /**
     * Handle clear button click
     */
    @FXML
    private void handleClearClick(MouseEvent event) {
        // Clear the display and reset to empty
        displayField.setText("");
    }
    
    /**
     * Handle delete button click
     */
    @FXML
    private void handleDeleteClick(MouseEvent event) {
        String currentText = displayField.getText();
        
        // If there's more than one character, remove the last one
        if (currentText.length() > 1) {
            displayField.setText(currentText.substring(0, currentText.length() - 1));
        } else {
            // If there's only one character or empty, reset to empty
            displayField.setText("");
        }
    }
} 