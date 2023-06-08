package main.levels.act_3.l2;

import config.levels.resource;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class lesson {
    @FXML Button start;
    @FXML Button exit;

    
    resource CONFIG = new resource();

    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    @FXML
    private void START() {
        try {
            Stage primaryStage = (Stage) start.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG.LEVEL.A3_L2)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void RETURN() {
        try {
            Stage primaryStage = (Stage) exit.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG.HOME)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
