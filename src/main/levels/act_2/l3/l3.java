package main.levels.act_2.l3;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class l3 implements Initializable{
    @FXML private Label       question;
    @FXML private Label       example;
    @FXML private ScrollPane  CodeBlock;
    @FXML private Button      c1;
    @FXML private Button      c2;
    @FXML private Button      c3;
    @FXML private Button      c4;
    @FXML private Button      submit;
    @FXML private Label       lives;
    @FXML private ImageView   exit;
    @FXML private VBox        popup;
    @FXML private VBox        popup_lives;
    @FXML private Label       score;
    @FXML private ProgressBar progressbar;
    @FXML private Label       tip;

    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
    
    questions CONFIG = new questions();
    resource STYLE   = new resource();

    public String CHOICE;
    public Button BUTTON;

    public int    LIVES            = STYLE.LIVES;
    public int    CURRENT_QUESTION = 1;
    public int    COUNTER          = 0;
    public int    SCORE            = 0;
    public double PROGRESS         = 0;
    public int    TOTAL_QUESTIONS  = (int) (PROGRESS + CONFIG.TOTAL_QUESTIONS);
    public int    PASSING_SCORE    = (int) (TOTAL_QUESTIONS * STYLE.THRESHOLD);
    
    public void start() {
      loadQuestions();
      popup.setVisible(false);
      popup_lives.setVisible(false);
      score.setText("SCORE: 0/" + String.valueOf(CONFIG.TOTAL_QUESTIONS));
      tip.setText("Earn at least " + String.valueOf(PASSING_SCORE) + " points!");
      progressbar.setProgress(PROGRESS/CONFIG.TOTAL_QUESTIONS);
      lives.setText(String.valueOf(LIVES));
    }

    @FXML
    private void EXIT() {
        popup.setVisible(true);
    }

    @FXML
    private void YES(ActionEvent event) {
        Stage primaryStage = (Stage) exit.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(STYLE.HOME)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void NO(ActionEvent event) {
        popup.setVisible(false);
    }

    @FXML
    private void RESTART(ActionEvent event) {
        Stage primaryStage = (Stage) exit.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(STYLE.LEVEL.A2_L3)); 
            Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadQuestions() {
        SetStyle(c1, "DEFAULT");
        SetStyle(c2, "DEFAULT");
        SetStyle(c3, "DEFAULT");
        SetStyle(c4, "DEFAULT");
        submit.setText("SUBMIT");
        submit.setDisable(true);
        c1.setDisable(false);
        c2.setDisable(false);
        c3.setDisable(false);
        c4.setDisable(false);
        example.setManaged(false);
        example.setVisible(false);
        CodeBlock.setManaged(false);
        CodeBlock.setVisible(false);

        if (CURRENT_QUESTION == 1) {
            question.setText(CONFIG.Q1.QUESTION);
            
            if(CONFIG.Q1.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q1.EXAMPLE);
            }

            c1.setText(CONFIG.Q1.CHOICE_1);
            c2.setText(CONFIG.Q1.CHOICE_2);
            c3.setText(CONFIG.Q1.CHOICE_3);
            c4.setText(CONFIG.Q1.CHOICE_4);
        } else 

        if (CURRENT_QUESTION == 2) {
            question.setText(CONFIG.Q2.QUESTION);
            
            if(CONFIG.Q2.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q2.EXAMPLE);
            }
            c1.setText(CONFIG.Q2.CHOICE_1);
            c2.setText(CONFIG.Q2.CHOICE_2);
            c3.setText(CONFIG.Q2.CHOICE_3);
            c4.setText(CONFIG.Q2.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 3) {
            question.setText(CONFIG.Q3.QUESTION);
            
            if(CONFIG.Q3.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q3.EXAMPLE);
            }

            c1.setText(CONFIG.Q3.CHOICE_1);
            c2.setText(CONFIG.Q3.CHOICE_2);
            c3.setText(CONFIG.Q3.CHOICE_3);
            c4.setText(CONFIG.Q3.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 4) {
            question.setText(CONFIG.Q4.QUESTION);

            if(CONFIG.Q4.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q4.EXAMPLE);
            }

            c1.setText(CONFIG.Q4.CHOICE_1);
            c2.setText(CONFIG.Q4.CHOICE_2);
            c3.setText(CONFIG.Q4.CHOICE_3);
            c4.setText(CONFIG.Q4.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 5) {
            question.setText(CONFIG.Q5.QUESTION);

            if(CONFIG.Q5.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q5.EXAMPLE);
            }

            c1.setText(CONFIG.Q5.CHOICE_1);
            c2.setText(CONFIG.Q5.CHOICE_2);
            c3.setText(CONFIG.Q5.CHOICE_3);
            c4.setText(CONFIG.Q5.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 6) {
            question.setText(CONFIG.Q6.QUESTION);

            if(CONFIG.Q6.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q6.EXAMPLE);
            }

            c1.setText(CONFIG.Q6.CHOICE_1);
            c2.setText(CONFIG.Q6.CHOICE_2);
            c3.setText(CONFIG.Q6.CHOICE_3);
            c4.setText(CONFIG.Q6.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 7) {
            question.setText(CONFIG.Q7.QUESTION);

            if(CONFIG.Q7.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q7.EXAMPLE);
            }

            c1.setText(CONFIG.Q7.CHOICE_1);
            c2.setText(CONFIG.Q7.CHOICE_2);
            c3.setText(CONFIG.Q7.CHOICE_3);
            c4.setText(CONFIG.Q7.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 8) {
            question.setText(CONFIG.Q8.QUESTION);

            if(CONFIG.Q8.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q8.EXAMPLE);
            }

            c1.setText(CONFIG.Q8.CHOICE_1);
            c2.setText(CONFIG.Q8.CHOICE_2);
            c3.setText(CONFIG.Q8.CHOICE_3);
            c4.setText(CONFIG.Q8.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 9) {
            question.setText(CONFIG.Q9.QUESTION);

            if(CONFIG.Q9.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q9.EXAMPLE);
            }

            c1.setText(CONFIG.Q9.CHOICE_1);
            c2.setText(CONFIG.Q9.CHOICE_2);
            c3.setText(CONFIG.Q9.CHOICE_3);
            c4.setText(CONFIG.Q9.CHOICE_4);
        } else

        if (CURRENT_QUESTION == 10) {
            question.setText(CONFIG.Q10.QUESTION);

            if(CONFIG.Q10.EXAMPLE != null) {
                example.setManaged(!example.isManaged());
                example.setVisible(!example.isVisible());
                CodeBlock.setManaged(!CodeBlock.isManaged());
                CodeBlock.setVisible(!CodeBlock.isVisible());
                example.setText(CONFIG.Q10.EXAMPLE);
            }

            c1.setText(CONFIG.Q10.CHOICE_1);
            c2.setText(CONFIG.Q10.CHOICE_2);
            c3.setText(CONFIG.Q10.CHOICE_3);
            c4.setText(CONFIG.Q10.CHOICE_4);
        }
    }

    private void DisableAllButtons() {
        if (CURRENT_QUESTION > CONFIG.TOTAL_QUESTIONS) {
            submit.setDisable(true);
            progressHandler();
            DisableButtons();
            return;
        }
    }
    
    @FXML
    public void SELECT_C1(ActionEvent event) {
        CHOICE = c1.getText().toString();
        BUTTON = c1;
        submit.setDisable(false);
        SetStyle(c1, "SELECT");
        SetStyle(c2, "DESELECT");
        SetStyle(c3, "DESELECT");
        SetStyle(c4, "DESELECT");
    }

    @FXML
    public void SELECT_C2(ActionEvent event) {
        CHOICE = c2.getText().toString();
        BUTTON = c2;
        submit.setDisable(false);
        SetStyle(c1, "DESELECT");
        SetStyle(c2, "SELECT");
        SetStyle(c3, "DESELECT");
        SetStyle(c4, "DESELECT");
    }

    @FXML
    public void SELECT_C3(ActionEvent event) {
        CHOICE = c3.getText().toString();
        BUTTON = c3;
        submit.setDisable(false);
        SetStyle(c1, "DESELECT");
        SetStyle(c2, "DESELECT");
        SetStyle(c3, "SELECT");
        SetStyle(c4, "DESELECT");
    }

    @FXML
    public void SELECT_C4(ActionEvent event) {
        CHOICE = c4.getText().toString();
        BUTTON = c4;
        submit.setDisable(false);
        SetStyle(c1, "DESELECT");
        SetStyle(c2, "DESELECT");
        SetStyle(c3, "DESELECT");
        SetStyle(c4, "SELECT");
    }

    @FXML
    public void SUBMIT(ActionEvent event) {
        if (CHOICE.equals(null)) {
            return;
        }
        COUNTER++;
        if (COUNTER == 1) {
            checkAnswer(BUTTON, CHOICE);
            nextQuestion(submit);
            
        } else

        if (COUNTER == 2) {
            COUNTER = 0;
            loadQuestions();
            DisableAllButtons();
            levelComplete(submit);
        }
    }

    private void DisableButtons() {
        c1.setDisable(true);
        c2.setDisable(true);
        c3.setDisable(true);
        c4.setDisable(true);
    }

    private void SetParentStyle(AnchorPane parent) {
        parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                        "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
    }

    private void checkAnswer(Button button, String answer) {
        
        if (CURRENT_QUESTION == 1) {
            if (answer.equals(CONFIG.Q1.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c3.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 2) {
            if (answer.equals(CONFIG.Q2.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c1.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 3) {
            if (answer.equals(CONFIG.Q3.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c2.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 4) {
            if (answer.equals(CONFIG.Q4.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c4.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 5) {
            if (answer.equals(CONFIG.Q5.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c3.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 6) {
            if (answer.equals(CONFIG.Q6.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c3.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 7) {
            if (answer.equals(CONFIG.Q7.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c2.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 8) {
            if (answer.equals(CONFIG.Q8.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c4.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 9) {
            if (answer.equals(CONFIG.Q9.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c4.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        } else

        if (CURRENT_QUESTION == 10) {
            if (answer.equals(CONFIG.Q10.ANSWER)){
                SetStyle(button, "CORRECT");
                scoreHandler("CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c1.getParent();
                SetParentStyle(parent);
                livesHandler();
                scoreHandler("INCORRECT");
            }
        }

        progressHandler();
        DisableButtons();

    }

    private void livesHandler() {
        LIVES--;
        lives.setText(String.valueOf(LIVES));
        if (LIVES <= 0) {
            popup_lives.setVisible(true);
        }
    }

    private void scoreHandler(String STATE) {
        if (STATE.equals("CORRECT")) {
            SCORE++;
            if (SCORE >= CONFIG.TOTAL_QUESTIONS) {
                SCORE  = CONFIG.TOTAL_QUESTIONS;
            }
        } 
        score.setText("SCORE: " + String.valueOf(SCORE) + "/" + (CONFIG.TOTAL_QUESTIONS));
    }

    private void progressHandler() {
        PROGRESS++;
        progressbar.setProgress(PROGRESS/CONFIG.TOTAL_QUESTIONS);
    }

    private void nextQuestion(Button button) {
        CURRENT_QUESTION++;
        button.setText("NEXT");
    }

    private void levelComplete(Button button) {
        if (CURRENT_QUESTION > CONFIG.TOTAL_QUESTIONS) {
            Stage primaryStage = (Stage) button.getScene().getWindow();
            FXMLLoader loader  = new FXMLLoader(getClass().getResource(STYLE.LEVEL_COMPLETE.A2_L3)); 
            try {
                Parent root = loader.load();
                Scene scene = new Scene(root, screenSize.getWidth(), screenSize.getHeight());
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

            completed SEND_SCORE = loader.getController();
            SEND_SCORE.setTotal(SCORE, CONFIG.TOTAL_QUESTIONS);
            return;
        }
    }

    private void SetStyle(Button button, String STATE) {
        if (button == null) return;
        
        if (STATE.equals("DEFAULT")) {
            AnchorPane parent = (AnchorPane) button.getParent();
            parent.setStyle("-fx-background-color:" + STYLE.COLOR.DESELECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.DESELECT_SHADOW + ", 0, 0, 0, 10);"
                            );
        }

        if (STATE.equals("SELECT")) {
            AnchorPane parent = (AnchorPane) button.getParent();
            parent.setStyle("-fx-background-color:" + STYLE.COLOR.SELECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.SELECT_SHADOW + ", 0, 0, 0, 10);"
                            );
        } else
        if (STATE.equals("DESELECT")) {
            AnchorPane parent = (AnchorPane) button.getParent();
            parent.setStyle("-fx-background-color:" + STYLE.COLOR.DESELECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.DESELECT_SHADOW + ", 0, 0, 0, 10);"
                            );
        } else
        if (STATE.equals("CORRECT")) {
            AnchorPane parent = (AnchorPane) button.getParent();
            parent.setStyle("-fx-background-color:" + STYLE.COLOR.CORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.CORRECT_SHADOW + ", 0, 0, 0, 10);"
                            );
        } else
        if (STATE.equals("INCORRECT")) {
            AnchorPane parent = (AnchorPane) button.getParent();
            parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT_CHOICE + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_CHOICE_SHADOW + ", 0, 0, 0, 10);"
                            );
        }
    }    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        start();
    }
}
