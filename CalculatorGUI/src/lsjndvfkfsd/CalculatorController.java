package lsjndvfkfsd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label printLabel;


    @FXML
    private void buttonPressed(ActionEvent actionEvent) {
        printLabel.setText("Button pressed");
    }
}
