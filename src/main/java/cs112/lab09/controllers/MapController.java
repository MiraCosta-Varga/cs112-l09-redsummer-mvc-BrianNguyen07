package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import cs112.lab09.models.RevisedHistoricalEvent;

public class MapController {

    @FXML
    private void bisbeeButtonAction() {
        openEventWindow("Bisbee, Arizona", new RevisedHistoricalEvent("Bisbee, Arizona", "Details about Bisbee event..."));
    }

    @FXML
    private void sanFranciscoButtonAction() {
        openEventWindow("San Francisco, California", new RevisedHistoricalEvent("San Francisco, California", "Details about San Francisco event..."));
    }

    private void openEventWindow(String location, RevisedHistoricalEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cs112/lab09/event-view.fxml"));
            Parent root = loader.load();

            EventController controller = loader.getController();
            controller.initData(location, event);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
