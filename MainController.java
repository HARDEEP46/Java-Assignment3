package com.example.assignment3javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Controller class for handling user interactions.
 */
public class MainController {
    @FXML
    private AnchorPane mainPage;

    @FXML
    private AnchorPane mainPage1;

    @FXML
    private AnchorPane mainPage2;

    @FXML
    private Label currentDate;

    @FXML
    private TextField tempInput;

    @FXML
    private Label result;

    @FXML
    private Label result1;

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    /**
     * Switches to the temperature calculator page.
     */
    @FXML
    void tempButton(ActionEvent event) {
        mainPage.setVisible(false);
        mainPage1.setVisible(false);
        mainPage2.setVisible(true);
    }

    /**
     * Switches back to the main menu.
     */
    @FXML
    void mainMenu(ActionEvent event) {
        mainPage.setVisible(true);
        mainPage1.setVisible(false);
        mainPage2.setVisible(false);
    }

    /**
     * Switches to the simple calculator page.
     */
    @FXML
    void simpleCalculatorButton(ActionEvent event) {
        mainPage.setVisible(false);
        mainPage1.setVisible(true);
    }

    /**
     * Performs subtraction operation.
     */
    @FXML
    void subtraction(ActionEvent event) {
        calculate(new Subtraction());
    }

    /**
     * Performs multiplication operation.
     */
    @FXML
    void multiply(ActionEvent event) {
        calculate(new Multiply());
    }

    /**
     * Performs division operation.
     */
    @FXML
    void division(ActionEvent event) {
        calculate(new Division());
    }

    /**
     * Performs addition operation.
     */
    @FXML
    void addition(ActionEvent event) {
        calculate(new Addition());
    }

    /**
     * Generic method to perform calculation using a given MathOperation.
     */
    private void calculate(MathOperation operation) {
        double number1 = Double.parseDouble(input1.getText());
        double number2 = Double.parseDouble(input2.getText());

        double resultValue = operation.operate(number1, number2);
        result.setText(String.valueOf(resultValue));
    }

    /**
     * Initializes the controller class and updates the date label.
     */
    public void initialize() {
        updateDate();
    }

    /**
     * Updates the date label with the current date.
     */
    @FXML
    private void updateDate() {
        Date currentD = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yy");
        currentDate.setText(date.format(currentD));
    }

    /**
     * Converts Celsius to Fahrenheit and displays the result.
     */
    @FXML
    void convertCelsiusToFahrenheit(ActionEvent event) {
        String inputText = tempInput.getText();
        if (!inputText.isEmpty()) {
            double celsius = Double.parseDouble(inputText);
            CelsiusToFahrenheit converter = new CelsiusToFahrenheit();
            double fahrenheit = converter.convert(celsius);
            result1.setText(String.valueOf(fahrenheit));
        } else {
            result1.setText("Please enter a temperature.");
        }
    }

    /**
     * Converts Fahrenheit to Celsius and displays the result.
     */
    @FXML
    void convertFahrenheitToCelsius(ActionEvent event) {
        String inputText = tempInput.getText();
        if (!inputText.isEmpty()) {
            double fahrenheit = Double.parseDouble(inputText);
            FahrenheitToCelsius converter = new FahrenheitToCelsius();
            double celsius = converter.convert(fahrenheit);
            result1.setText(String.valueOf(celsius));
        } else {
            result1.setText("Please enter a temperature.");
        }
    }
}
