package com.example.class_project_oop;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Projectviewcontroller
{
    @javafx.fxml.FXML
    private TextField xtextfield;
    @javafx.fxml.FXML
    private TextField ytextfield;
    @javafx.fxml.FXML
    private Label resultlabel;
    @javafx.fxml.FXML
    private Button addbutton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dividebuttonOnAction(ActionEvent actionEvent) {
        int xval = Integer.parseInt(xtextfield.getText());
        int yval = Integer.parseInt(ytextfield.getText());
        int div = xval / yval;
        String result = Integer.toString(div);
        resultlabel.setText(" x / y = "+result);
    }

    @javafx.fxml.FXML
    public void subtractbuttonOnAction(ActionEvent actionEvent) {
        int xval = Integer.parseInt(xtextfield.getText());
        int yval = Integer.parseInt(ytextfield.getText());
        int sub = xval - yval;
        String result = Integer.toString(sub);
        resultlabel.setText(" x - y = "+result);
    }

    @javafx.fxml.FXML
    public void multiplybuttonOnAction(ActionEvent actionEvent) {
        int xval = Integer.parseInt(xtextfield.getText());
        int yval = Integer.parseInt(ytextfield.getText());
        int mult = xval * yval;
        String result = Integer.toString(mult);
        resultlabel.setText(" x * y = "+result);
    }

    @javafx.fxml.FXML
    public void addbuttonOnAction(ActionEvent actionEvent) {
        int xval = Integer.parseInt(xtextfield.getText());
        int yval = Integer.parseInt(ytextfield.getText());
        int sum = xval + yval;
        String result = Integer.toString(sum);
        resultlabel.setText(" x + y = "+result);
    }

    @javafx.fxml.FXML
    public void addbuttonnmouseClicked(Event event) {
        addbutton.setText("Click Me!");
    }

    @javafx.fxml.FXML
    public void addbuttonmouseexit(Event event) {
        addbutton.setText("Add");
    }
}