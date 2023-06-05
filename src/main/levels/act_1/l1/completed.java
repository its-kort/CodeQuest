package main.levels.act_1.l1;

import java.net.URL;
import java.util.ResourceBundle;

import config.levels.resource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class completed implements Initializable {
    @FXML private Label total_score;

    l1 LEVEL = new l1();

    resource CONFIG = new resource();
    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
    
    public void setTotal(int score, int questions) {
        total_score.setText(score + "/" + questions);
    }

    @FXML
    private void EXIT(ActionEvent event) {
         try {
            Stage primaryStage = (Stage) total_score.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG.HOME)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void NEXT(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
