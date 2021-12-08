package com.oop.excersise.lab9;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calculator {
    public static void checker(TextField numOneField, TextField numTwoField, TextField resultField, Button button) {
        button.setOnAction(actionEvent ->
        {
            try {
                calculate(numOneField, numTwoField, resultField);
            } catch (UnluckyException unlucky) {
                resultField.setText(unlucky.message);
            } catch (DivisionByZeroException divisionByZero) {
                resultField.setText(divisionByZero.message);
            } catch (NumberFormatException invalidFormat) {
                resultField.setText("Provide correct input");
            }
        });
    }

    private static void calculate(TextField num1, TextField num2, TextField resultField) throws UnluckyException, DivisionByZeroException {
        float numOne;
        float numTwo;
        float result;

        numOne = Float.parseFloat(num1.getText());
        numTwo = Float.parseFloat(num2.getText());

        if (numTwo == 13.0) {
            throw new UnluckyException();
        }

        if (numTwo == 0) {
            throw new DivisionByZeroException();
        }

        result = numOne / numTwo;

        resultField.setText(String.valueOf(result));
    }
}