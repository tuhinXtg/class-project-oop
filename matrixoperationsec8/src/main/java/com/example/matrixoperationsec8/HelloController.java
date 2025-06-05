package com.example.matrixoperationsec8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Matrix m = new Matrix();
        m.setmatrixWithrandomValues(3,4);
        System.out.println("Matrix m:");
        m.showmatrixToConsole();
        Matrix m2;
        m2 = new Matrix();
        m2.setmatrixWithrandomValues(5,3);
        System.out.println("\nMatrix m2:");
        m2.showmatrixToConsole();
    }
}