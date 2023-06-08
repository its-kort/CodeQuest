package main.menu;

import config.levels.resource;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class start_screen {
    @FXML Button start;
    @FXML Button exit;

    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    resource CONFIG = new resource();
    @FXML
    public void START() {
        Stage primaryStage = (Stage) start.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG.HOME)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void EXIT() {
        Stage primaryStage = (Stage) start.getScene().getWindow();
        try {
            primaryStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
