import config.preloader.preloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class launcher extends Application{
    
    preloader config = new preloader();
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // Load FXML file
        String FXML = config.FXML;
        Parent root = FXMLLoader.load(getClass().getResource(FXML));

        // Set scene
        Scene scene = new Scene(root);
        Image logo  = new Image(config.logo);
        
        primaryStage.setMaximized(false);
        primaryStage.getIcons().add(logo);
        primaryStage.setTitle(config.title);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    public static void main(String[] args) {
        launch(args);
    }
}
