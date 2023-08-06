package javafxcalculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    private String operator = "";
    private double num1 = 0;
    private boolean startNewNumber = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextField display = new TextField();
        display.setEditable(false);
        grid.add(display, 0, 0, 4, 1);

        String[][] buttons = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                Button button = new Button(buttons[i][j]);
                button.setOnAction(e -> handleButtonClick(display, button.getText()));
                grid.add(button, j, i + 1);
            }
        }

        primaryStage.setScene(new Scene(grid, 250, 300));
        primaryStage.show();
    }

    private void handleButtonClick(TextField display, String value) {
        if (value.matches("[0-9.]")) {
            if (startNewNumber) {
                display.setText(value);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + value);
            }
        } else if (value.equals("=")) {
            calculate(display);
        } else {
            if (!operator.isEmpty()) {
                calculate(display);
            }
            num1 = Double.parseDouble(display.getText());
            operator = value;
            startNewNumber = true;
        }
    }

    private void calculate(TextField display) {
        double num2 = Double.parseDouble(display.getText());
        switch (operator) {
            case "+":
                num1 += num2;
                break;
            case "-":
                num1 -= num2;
                break;
            case "*":
                num1 *= num2;
                break;
            case "/":
                if (num2 != 0) {
                    num1 /= num2;
                } else {
                    display.setText("Error");
                    num1 = 0;
                }
                break;
        }
        display.setText(String.valueOf(num1));
        operator = "";
    }
}

