package main.menu;

import java.net.URL;
import java.util.ResourceBundle;

import config.levels.resource;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import main.data.ResourceManager;
import main.data.SaveData;

public class main_menu implements Initializable{
    @FXML private ImageView start;
    @FXML private ImageView a1_l1;
    @FXML private ImageView a1_l2;
    @FXML private ImageView a1_l3;
    @FXML private ImageView a1_l4;
    @FXML private ImageView a1_l5;
    
    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    resource CONFIG_IMG  = new resource();
    SaveData CONFIG_DATA = new SaveData();

    Image LEVEL_LOCKED   = CONFIG_IMG.LEVEL_LOCKED;
    Image LEVEL_UNLOCKED = CONFIG_IMG.LEVEL_UNLOCKED;
    Image LEVEL_COMPLETED = CONFIG_IMG.LEVEL_COMPLETED;


    public void loadData() {
        a1_l2.setDisable(true);
        a1_l3.setDisable(true);
        a1_l4.setDisable(true);
        a1_l5.setDisable(true);

        try {
            SaveData data = (SaveData) ResourceManager.load(CONFIG_DATA.NAME);

            a1_l2.setImage(LEVEL_LOCKED);
            a1_l3.setImage(LEVEL_LOCKED);
            a1_l4.setImage(LEVEL_LOCKED);
            a1_l5.setImage(LEVEL_LOCKED);
            

            if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L1)) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);

            } else

            if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L2)) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);

                a1_l3.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
            }
            
            if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L3)) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);
                a1_l3.setImage(LEVEL_COMPLETED);

                a1_l4.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
                a1_l4.setDisable(false);
            }
            
            if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L4)) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);
                a1_l3.setImage(LEVEL_COMPLETED);
                a1_l4.setImage(LEVEL_COMPLETED);

                a1_l5.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
                a1_l4.setDisable(false);
                a1_l5.setDisable(false);
            }
            
            if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L5)) {
                start.setVisible(false);
                
                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);
                a1_l3.setImage(LEVEL_COMPLETED);
                a1_l4.setImage(LEVEL_COMPLETED);
                a1_l5.setImage(LEVEL_COMPLETED);


                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
                a1_l4.setDisable(false);
                a1_l5.setDisable(false);
            }
            
                        
        } catch (Exception e) {
            System.out.println("NO DATA FOUND");
                a1_l2.setImage(LEVEL_LOCKED);
                a1_l3.setImage(LEVEL_LOCKED);
                a1_l4.setImage(LEVEL_LOCKED);
                a1_l5.setImage(LEVEL_LOCKED);
        }

    }


    @FXML
    private boolean LEVEL_1() {
        Stage primaryStage = (Stage) a1_l1.getScene().getWindow();

        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L1)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean LEVEL_2() {
        Stage primaryStage = (Stage) a1_l2.getScene().getWindow();
        System.out.println("main_menu.LEVEL_2()");
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L2)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }


}
