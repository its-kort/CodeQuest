package main.preloader;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

public class preloader implements Initializable {

    @FXML private ProgressBar ProgressBar;

    double progress;
    double delay = .035;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        increaseProgress();
    }
    
    public void increaseProgress() {
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    updateProgress(i, 100);
                    Thread.sleep((long) (delay * 1000));
                }
                System.out.println("LOAD END");
                return null;
            }
        };

        ProgressBar.progressProperty().bind(task.progressProperty());
        new Thread(task).start();
    }
}
