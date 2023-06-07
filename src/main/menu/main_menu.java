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
    @FXML private ImageView start2;

    @FXML private ImageView a1_l1;
    @FXML private ImageView a1_l2;
    @FXML private ImageView a1_l3;
    @FXML private ImageView a1_l4;
    @FXML private ImageView a1_l5;

    @FXML private ImageView a2_l1;
    @FXML private ImageView a2_l2;
    @FXML private ImageView a2_l3;
    @FXML private ImageView a2_l4;
    @FXML private ImageView a2_l5;
    
    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    resource CONFIG_IMG  = new resource();
    SaveData CONFIG_DATA = new SaveData();

    Image LEVEL_LOCKED   = CONFIG_IMG.LEVEL_LOCKED;
    Image LEVEL_UNLOCKED = CONFIG_IMG.LEVEL_UNLOCKED;
    Image LEVEL_COMPLETED = CONFIG_IMG.LEVEL_COMPLETED;


    public void loadData() {
        start2.setVisible(false);

        a1_l2.setDisable(true);
        a1_l3.setDisable(true);
        a1_l4.setDisable(true);
        a1_l5.setDisable(true);

        a2_l1.setDisable(true);
        a2_l2.setDisable(true);
        a2_l3.setDisable(true);
        a2_l4.setDisable(true);
        a2_l5.setDisable(true);

        try {
            SaveData data = (SaveData) ResourceManager.load(CONFIG_DATA.NAME);

            a1_l2.setImage(LEVEL_LOCKED);
            a1_l3.setImage(LEVEL_LOCKED);
            a1_l4.setImage(LEVEL_LOCKED);
            a1_l5.setImage(LEVEL_LOCKED);

            a2_l1.setImage(LEVEL_LOCKED);
            a2_l2.setImage(LEVEL_LOCKED);
            a2_l3.setImage(LEVEL_LOCKED);
            a2_l4.setImage(LEVEL_LOCKED);
            a2_l5.setImage(LEVEL_LOCKED);
            

            // if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L1)) {
            if (data.A1_L1 == true) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);

            } else

            
            // if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L2)) {
            if (data.A1_L2 == true) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);

                a1_l3.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
            }
            
            // if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L3)) {
            if (data.A1_L3 == true) {
                start.setVisible(false);

                a1_l1.setImage(LEVEL_COMPLETED);
                a1_l2.setImage(LEVEL_COMPLETED);
                a1_l3.setImage(LEVEL_COMPLETED);

                a1_l4.setImage(LEVEL_UNLOCKED);

                a1_l2.setDisable(false);
                a1_l3.setDisable(false);
                a1_l4.setDisable(false);
            }
            
            // if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L4)) {
            if (data.A1_L4 == true) {
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
            
            // if (data.LEVEL.equals(CONFIG_DATA.ACT_1.L5)) {
            if (data.A1_L5 == true) {
                start2.setVisible(true);
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

                a2_l1.setImage(LEVEL_UNLOCKED);

                a2_l1.setDisable(false);
            }

            if (data.A2_L1 == true) {
                start2.setVisible(false);
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

                a2_l1.setImage(LEVEL_COMPLETED);

                a2_l2.setImage(LEVEL_UNLOCKED);

                a2_l1.setDisable(false);
                a2_l2.setDisable(false);
            }
            
            if (data.A2_L2 == true) {
                start2.setVisible(false);
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

                a2_l1.setImage(LEVEL_COMPLETED);
                a2_l2.setImage(LEVEL_COMPLETED);

                a2_l3.setImage(LEVEL_UNLOCKED);

                a2_l1.setDisable(false);
                a2_l2.setDisable(false);
                a2_l3.setDisable(false);

            }

            if (data.A2_L3 == true) {
                start2.setVisible(false);
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

                a2_l1.setImage(LEVEL_COMPLETED);
                a2_l2.setImage(LEVEL_COMPLETED);
                a2_l3.setImage(LEVEL_COMPLETED);

                a2_l4.setImage(LEVEL_UNLOCKED);

                a2_l1.setDisable(false);
                a2_l2.setDisable(false);
                a2_l3.setDisable(false);
                a2_l4.setDisable(false);
            }

            if (data.A2_L4 == true) {
                start2.setVisible(false);
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

                a2_l1.setImage(LEVEL_COMPLETED);
                a2_l2.setImage(LEVEL_COMPLETED);
                a2_l3.setImage(LEVEL_COMPLETED);
                a2_l4.setImage(LEVEL_COMPLETED);

                a2_l5.setImage(LEVEL_UNLOCKED);

                a2_l1.setDisable(false);
                a2_l2.setDisable(false);
                a2_l3.setDisable(false);
                a2_l4.setDisable(false);
                a2_l5.setDisable(false);
            }

            if (data.A2_L5 == true) {
                start2.setVisible(false);
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

                a2_l1.setImage(LEVEL_COMPLETED);
                a2_l2.setImage(LEVEL_COMPLETED);
                a2_l3.setImage(LEVEL_COMPLETED);
                a2_l4.setImage(LEVEL_COMPLETED);
                a2_l5.setImage(LEVEL_COMPLETED);

                a2_l1.setDisable(false);
                a2_l2.setDisable(false);
                a2_l3.setDisable(false);
                a2_l4.setDisable(false);
                a2_l5.setDisable(false);
            }
                        
        } catch (Exception e) {
            System.out.println("NO DATA FOUND");
                a1_l2.setImage(LEVEL_LOCKED);
                a1_l3.setImage(LEVEL_LOCKED);
                a1_l4.setImage(LEVEL_LOCKED);
                a1_l5.setImage(LEVEL_LOCKED);

                a2_l1.setImage(LEVEL_LOCKED);
                a2_l2.setImage(LEVEL_LOCKED);
                a2_l3.setImage(LEVEL_LOCKED);
                a2_l4.setImage(LEVEL_LOCKED);
                a2_l5.setImage(LEVEL_LOCKED);
        }

    }


    @FXML
    private boolean A1_L1() {
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
    private boolean A1_L2() {
        Stage primaryStage = (Stage) a1_l2.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L2)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A1_L3() {
        Stage primaryStage = (Stage) a1_l3.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L3)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A1_L4() {
        Stage primaryStage = (Stage) a1_l4.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L4)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }   

        return false;
    }

    @FXML
    private boolean A1_L5() {
        Stage primaryStage = (Stage) a1_l5.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A1_L5)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A2_L1() {
        Stage primaryStage = (Stage) a2_l1.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A2_L1)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A2_L2() {
        Stage primaryStage = (Stage) a2_l2.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A2_L2)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A2_L3() {
        Stage primaryStage = (Stage) a2_l3.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A2_L3)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A2_L4() {
        Stage primaryStage = (Stage) a2_l4.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A2_L4)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private boolean A2_L5() {
        Stage primaryStage = (Stage) a2_l5.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CONFIG_IMG.LESSON.A2_L5)); 
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
