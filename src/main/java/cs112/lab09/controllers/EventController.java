package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import cs112.lab09.models.RevisedHistoricalEvent;

public class EventController {

    @FXML
    private Label eventLocationLabel;
    @FXML
    private Label eventDetailsLabel;
    @FXML
    private Button closeButton;

    public void initData(String location, RevisedHistoricalEvent event) {
        eventLocationLabel.setText("Location: " + location);
        eventDetailsLabel.setText("Event Details: " + event.getDetails());
    }

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
