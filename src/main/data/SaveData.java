package main.data;

import java.io.Serializable;

public class SaveData implements Serializable {
    public static final long version = 1L;
    public String LEVEL;
    
    public class ACT_1 implements Serializable {
        public String L1 = "a1_l1";
        public String L2 = "a1_l2";
        public String L3 = "a1_l3";
        public String L4 = "a1_l4";
        public String L5 = "a1_l5";
    }

    public class ACT_2 implements Serializable {
        public String L1 = "a2_l1";
        public String L2 = "a2_l2";
        public String L3 = "a2_l3";
        public String L4 = "a2_l4";
        public String L5 = "a2_l5";
    }
    
    public String NAME = "DATA.save";

    public ACT_1 ACT_1 = new ACT_1();
    public ACT_2 ACT_2 = new ACT_2();

}
