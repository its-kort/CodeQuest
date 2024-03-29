package config.levels;

import javafx.scene.image.Image;

public class resource {
    public Image LEVEL_UNLOCKED = new Image("resource/media/menu/stage.png");
    public Image LEVEL_LOCKED   = new Image("resource/media/menu/stage_locked.png");
    public Image LEVEL_COMPLETED = new Image("resource/media/menu/stage_complete.png");

    public String HOME = "/resource/stage/main/menu/main_menu.fxml";
    public String START = "/resource/stage/main/menu/start_screen.fxml";

    public int LIVES           = 3;
    public int L5_LIVES        = LIVES + 2;
    public int TOTAL_QUESTIONS = 10;
    public double THRESHOLD    = 0.8;

    public class LEVEL_COMPLETE {
        public String A1_L1 = "/resource/stage/main/levels/act-1/l1/completed.fxml";
        public String A1_L2 = "/resource/stage/main/levels/act-1/l2/completed.fxml";
        public String A1_L3 = "/resource/stage/main/levels/act-1/l3/completed.fxml";
        public String A1_L4 = "/resource/stage/main/levels/act-1/l4/completed.fxml";
        public String A1_L5 = "/resource/stage/main/levels/act-1/l5/completed.fxml";

        public String A2_L1 = "/resource/stage/main/levels/act-2/l1/completed.fxml";
        public String A2_L2 = "/resource/stage/main/levels/act-2/l2/completed.fxml";
        public String A2_L3 = "/resource/stage/main/levels/act-2/l3/completed.fxml";
        public String A2_L4 = "/resource/stage/main/levels/act-2/l4/completed.fxml";
        public String A2_L5 = "/resource/stage/main/levels/act-2/l5/completed.fxml";

        public String A3_L1 = "/resource/stage/main/levels/act-3/l1/completed.fxml";
        public String A3_L2 = "/resource/stage/main/levels/act-3/l2/completed.fxml";
        public String A3_L3 = "/resource/stage/main/levels/act-3/l3/completed.fxml";
        public String A3_L4 = "/resource/stage/main/levels/act-3/l4/completed.fxml";
        public String A3_L5 = "/resource/stage/main/levels/act-3/l5/completed.fxml";
    }
    
    public class LESSON {
        public String A1_L1 = "/resource/stage/main/levels/act-1/l1/lesson.fxml";
        public String A1_L2 = "/resource/stage/main/levels/act-1/l2/lesson.fxml";
        public String A1_L3 = "/resource/stage/main/levels/act-1/l3/lesson.fxml";
        public String A1_L4 = "/resource/stage/main/levels/act-1/l4/lesson.fxml";
        public String A1_L5 = "/resource/stage/main/levels/act-1/l5/lesson.fxml";

        public String A2_L1 = "/resource/stage/main/levels/act-2/l1/lesson.fxml";
        public String A2_L2 = "/resource/stage/main/levels/act-2/l2/lesson.fxml";
        public String A2_L3 = "/resource/stage/main/levels/act-2/l3/lesson.fxml";
        public String A2_L4 = "/resource/stage/main/levels/act-2/l4/lesson.fxml";
        public String A2_L5 = "/resource/stage/main/levels/act-2/l5/lesson.fxml";

        public String A3_L1 = "/resource/stage/main/levels/act-3/l1/lesson.fxml";
        public String A3_L2 = "/resource/stage/main/levels/act-3/l2/lesson.fxml";
        public String A3_L3 = "/resource/stage/main/levels/act-3/l3/lesson.fxml";
        public String A3_L4 = "/resource/stage/main/levels/act-3/l4/lesson.fxml";
        public String A3_L5 = "/resource/stage/main/levels/act-3/l5/lesson.fxml";

    }
    
    public class LEVEL {
        public String A1_L1 = "/resource/stage/main/levels/act-1/l1/l1.fxml";
        public String A1_L2 = "/resource/stage/main/levels/act-1/l2/l2.fxml";
        public String A1_L3 = "/resource/stage/main/levels/act-1/l3/l3.fxml";
        public String A1_L4 = "/resource/stage/main/levels/act-1/l4/l4.fxml";
        public String A1_L5 = "/resource/stage/main/levels/act-1/l5/l5.fxml";

        public String A2_L1 = "/resource/stage/main/levels/act-2/l1/l1.fxml";
        public String A2_L2 = "/resource/stage/main/levels/act-2/l2/l2.fxml";
        public String A2_L3 = "/resource/stage/main/levels/act-2/l3/l3.fxml";
        public String A2_L4 = "/resource/stage/main/levels/act-2/l4/l4.fxml";
        public String A2_L5 = "/resource/stage/main/levels/act-2/l5/l5.fxml";

        public String A3_L1 = "/resource/stage/main/levels/act-3/l1/l1.fxml";
        public String A3_L2 = "/resource/stage/main/levels/act-3/l2/l2.fxml";
        public String A3_L3 = "/resource/stage/main/levels/act-3/l3/l3.fxml";
        public String A3_L4 = "/resource/stage/main/levels/act-3/l4/l4.fxml";
        public String A3_L5 = "/resource/stage/main/levels/act-3/l5/l5.fxml";

    }

    public class STYLE {

        public String DESELECT        = "#414145";
        public String DESELECT_SHADOW = "#303034";

        public String SELECT          = "#3C298F";
        public String SELECT_SHADOW   = "#251957";

        public String CORRECT         = "#54A44E";
        public String CORRECT_SHADOW  = "#3B5032";

        public String INCORRECT_CHOICE        = "#BC5050";
        public String INCORRECT_CHOICE_SHADOW = "#6A2C2C";

        public String INCORRECT        = "#C79D33";
        public String INCORRECT_SHADOW = "#7A6B32";

    }

    public STYLE          COLOR          = new STYLE();
    public LESSON         LESSON         = new LESSON();
    public LEVEL          LEVEL          = new LEVEL();
    public LEVEL_COMPLETE LEVEL_COMPLETE = new LEVEL_COMPLETE();
}
