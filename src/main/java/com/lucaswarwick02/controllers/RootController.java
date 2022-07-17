package com.lucaswarwick02.controllers;

import com.lucaswarwick02.WorldState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RootController {

    @FXML
    private Button guildButton;

    @FXML
    private Label label;

    @FXML
    private Label leftStatus;

    @FXML
    private Button pvpButton;

    @FXML
    private Label rightStatus;

    @FXML
    private Button shopButton;

    @FXML
    private Button worldButton;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    public void displayGuildData(ActionEvent event) {
        label.setText("");
    }

    @FXML
    public void displayPVPData(ActionEvent event) {
        label.setText("");
    }

    @FXML
    public void displayShopData(ActionEvent event) {
        label.setText("");
    }

    @FXML
    public void displayWorldData(ActionEvent event) {
        label.setText(WorldState.INSTANCE.worldData.toString());
    }

}
