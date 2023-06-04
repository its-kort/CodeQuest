package config.levels;

import javafx.scene.image.Image;

public class resource {
    public Image LEVEL_UNLOCKED = new Image("resource/media/menu/stage.png");
    public Image LEVEL_LOCKED  = new Image("resource/media/menu/stage_locked.png");

    public String A1_L1 = "/resource/stage/main/levels/act-1/l1/l1.fxml";

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

    public STYLE COLOR = new STYLE();
}
