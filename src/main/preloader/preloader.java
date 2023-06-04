package main.preloader;

import config.menu.main_menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class preloader implements Initializable {

    @FXML private ProgressBar ProgressBar;

    // double delay = .035;
    double delay = .005;


    main_menu config = new main_menu();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    updateProgress(i, 100);
                    Thread.sleep((long) (delay * 1000));
                }
                System.out.println("LOAD END");

                Platform.runLater(() -> {
                    try {
                        // Loads the main screen
                        Parent root = FXMLLoader.load(getClass().getResource(config.FXML)); 
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ProgressBar.getScene().getWindow();

                        stage.setScene(scene);
                        stage.setMaximized(true);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                return null;
            }
        };

        ProgressBar.progressProperty().bind(task.progressProperty());
        new Thread(task).start();
    }

}
