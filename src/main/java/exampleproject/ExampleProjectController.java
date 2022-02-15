package exampleproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ExampleProjectController {
    @FXML
    private AnchorPane background;

    @FXML
    private TextField firstNumber, secondNumber, operator;

    @FXML
    private Label result;

    private Calculator calculator;

    private void initCalculator(String operator) {
        calculator = new Calculator(operator);
    }

    @FXML
    private void handleButtonClick() {
        initCalculator(operator.getText());
        try {
            int result = calculator.calculate(Integer.parseInt(firstNumber.getText()),
                    Integer.parseInt(secondNumber.getText()));
            this.result.setText(firstNumber.getText() + " " + operator.getText() + " " + secondNumber.getText() + " = "
                    + String.valueOf(result));
        } catch (NumberFormatException e) {
            result.setText("Invalid number");
        }
    }

}
