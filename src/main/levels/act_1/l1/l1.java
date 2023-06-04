package main.levels.act_1.l1;

import java.net.URL;
import java.util.ResourceBundle;

import config.levels.resource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class l1 implements Initializable{
    @FXML private Label question;
    @FXML private Button c1;
    @FXML private Button c2;
    @FXML private Button c3;
    @FXML private Button c4;
    @FXML private Button submit;

    questions CONFIG = new questions();
    resource STYLE = new resource();

    public int CURRENT_QUESTION = 1;
    public String CHOICE;
    public Button BUTTON;
    public int COUNTER = 0;
    
    public void start() {
      loadQuestions();
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


        if (CURRENT_QUESTION == 1) {
            question.setText(CONFIG.Q1.QUESTION);
            c1.setText(CONFIG.Q1.CHOICE_1);
            c2.setText(CONFIG.Q1.CHOICE_2);
            c3.setText(CONFIG.Q1.CHOICE_3);
            c4.setText(CONFIG.Q1.CHOICE_4);
        } else 
        if (CURRENT_QUESTION == 2) {
            question.setText(CONFIG.Q2.QUESTION);
            c1.setText(CONFIG.Q2.CHOICE_1);
            c2.setText(CONFIG.Q2.CHOICE_2);
            c3.setText(CONFIG.Q2.CHOICE_3);
            c4.setText(CONFIG.Q2.CHOICE_4);
        } else
        if (CURRENT_QUESTION == 3) {
            question.setText(CONFIG.Q3.QUESTION);
            c1.setText(CONFIG.Q3.CHOICE_1);
            c2.setText(CONFIG.Q3.CHOICE_2);
            c3.setText(CONFIG.Q3.CHOICE_3);
            c4.setText(CONFIG.Q3.CHOICE_4);
        } else
        if (CURRENT_QUESTION == 4) {
            question.setText(CONFIG.Q4.QUESTION);
            c1.setText(CONFIG.Q4.CHOICE_1);
            c2.setText(CONFIG.Q4.CHOICE_2);
            c3.setText(CONFIG.Q4.CHOICE_3);
            c4.setText(CONFIG.Q4.CHOICE_4);
        } else
        if (CURRENT_QUESTION == 5) {
            question.setText(CONFIG.Q5.QUESTION);
            c1.setText(CONFIG.Q5.CHOICE_1);
            c2.setText(CONFIG.Q5.CHOICE_2);
            c3.setText(CONFIG.Q5.CHOICE_3);
            c4.setText(CONFIG.Q5.CHOICE_4);
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
        System.out.println(COUNTER);
        if (COUNTER == 1) {
            checkAnswer(BUTTON, CHOICE);
            nextQuestion(submit);
        } else

        if (COUNTER == 2) {
            COUNTER = 0;
            loadQuestions();
        }
    }


    private void checkAnswer(Button button, String answer) {
        if (CURRENT_QUESTION == 1) {
            if (answer.equals(CONFIG.Q1.ANSWER)){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                SetStyle(button, "CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c1.getParent();
                parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
            }
        } else
        if (CURRENT_QUESTION == 2) {
            if (answer.equals(CONFIG.Q2.ANSWER)){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                SetStyle(button, "CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c1.getParent();
                parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
            }
        } else
        if (CURRENT_QUESTION == 3) {
            if (answer.equals(CONFIG.Q3.ANSWER)){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                SetStyle(button, "CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c4.getParent();
                parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
            }
        } else
        if (CURRENT_QUESTION == 4) {
            if (answer.equals(CONFIG.Q4.ANSWER)){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                SetStyle(button, "CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c2.getParent();
                parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
            }
        } else
        if (CURRENT_QUESTION == 5) {
            if (answer.equals(CONFIG.Q5.ANSWER)){
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
                SetStyle(button, "CORRECT");
            } else {
                SetStyle(button, "INCORRECT");
                AnchorPane parent = (AnchorPane) c3.getParent();
                parent.setStyle("-fx-background-color:" + STYLE.COLOR.INCORRECT + ";" + 
                            "-fx-effect: dropshadow(gaussian," + STYLE.COLOR.INCORRECT_SHADOW + ", 0, 0, 0, 10);"
                );
                c1.setDisable(true);
                c2.setDisable(true);
                c3.setDisable(true);
                c4.setDisable(true);
            }
        }
    }

    private void nextQuestion(Button button) {
        CURRENT_QUESTION++;
        button.setText("NEXT");
    }

    private void SetStyle(Button button, String STATE) {
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
