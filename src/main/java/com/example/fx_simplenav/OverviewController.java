package com.example.fx_simplenav;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OverviewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onEmptyViewButtonClick() {

        Main.changeScene(ControllerNames.EmptyView);
    }




    public void changeView(ActionEvent actionEvent)
    {
        //welcomeText.setText("Test");
        //Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Main.changeScene(ControllerNames.DetailsView);

    }
}
