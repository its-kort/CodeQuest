package main.data;

import java.io.Serializable;

public class SaveData implements Serializable {
    public static final long version = 1L;
    // public String LEVEL;
    public boolean A1_L1;
    public boolean A1_L2;
    public boolean A1_L3;
    public boolean A1_L4;
    public boolean A1_L5;

    public boolean A2_L1;
    public boolean A2_L2;
    public boolean A2_L3;
    public boolean A2_L4;
    public boolean A2_L5;

    public boolean A3_L1;
    public boolean A3_L2;
    public boolean A3_L3;
    public boolean A3_L4;
    public boolean A3_L5;

    
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

    public class ACT_3 implements Serializable {
        public String L1 = "a3_l1";
        public String L2 = "a3_l2";
        public String L3 = "a3_l3";
        public String L4 = "a3_l4";
        public String L5 = "a3_l5";
    }
    
    public String NAME = "DATA.save";

    public ACT_1 ACT_1 = new ACT_1();
    public ACT_2 ACT_2 = new ACT_2();
    public ACT_3 ACT_3 = new ACT_3();

}
