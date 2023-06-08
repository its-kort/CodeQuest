package main.levels.act_3.l2;

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
import main.data.ResourceManager;
import main.data.SaveData;

public class completed implements Initializable {
    @FXML private Label total_score;

    l2 LEVEL = new l2();

    resource CONFIG = new resource();
    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
    
    public void setTotal(int score, int questions) {
        total_score.setText(score + "/" + questions);
    }

    public void start() {
        SaveData data = new SaveData();
        try {
            data = (SaveData) ResourceManager.load(data.NAME);
        } catch (Exception e) {
            System.out.println("Could not save data: " + e.getMessage());
        }
        
        data.A3_L2 = true;

        try {
            ResourceManager.save(data, data.NAME);
            System.out.println("Data saved!");
        } catch (Exception e) {
            System.out.println("Could not save data: " + e.getMessage());
        }
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
        try {
            Stage primaryStage = (Stage) total_score.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG.LESSON.A3_L3)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        start();
    }
}
