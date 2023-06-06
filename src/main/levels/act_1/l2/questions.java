package main.levels.act_1.l2;

public class questions {

    public class Q1 {
        public String QUESTION = "What type of data is the following?";
        public String EXAMPLE  = "fruit = \"Apple\";\nvegetable = \"Lettuce\";";
        public String CHOICE_1 = "int";
        public String CHOICE_2 = "char";
        public String CHOICE_3 = "alphabet";
        public String CHOICE_4 = "string";
        public String ANSWER = CHOICE_4;
    }

    public class Q2 {
        public String QUESTION = "A numeric data type which occupies 32 bits and holds single precision floating point numbers.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "long";
        public String CHOICE_2 = "double";
        public String CHOICE_3 = "float";
        public String CHOICE_4 = "short";
        public String ANSWER = CHOICE_3;
    }

    public class Q3 {
        public String QUESTION = "A data type which holds a value of either true or false.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "int";
        public String CHOICE_2 = "boolean";
        public String CHOICE_3 = "string";
        public String CHOICE_4 = "short";
        public String ANSWER = CHOICE_2;
    }

    public class Q4 {
        public String QUESTION = "What type of data is the following?";
        public String EXAMPLE  = "open = true;";
        public String CHOICE_1 = "string";
        public String CHOICE_2 = "boolean";
        public String CHOICE_3 = "int";
        public String CHOICE_4 = "double";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "What type of data is the following?";
        public String EXAMPLE  = "room = \'C\';";
        public String CHOICE_1 = "short";
        public String CHOICE_2 = "float";
        public String CHOICE_3 = "boolean";
        public String CHOICE_4 = "char";
        public String ANSWER = CHOICE_4;
    }

    public class Q6 {
        public String QUESTION = "A numeric data type which occupies 16 bits and holds values from -32768 to 32767.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "short";
        public String CHOICE_2 = "double";
        public String CHOICE_3 = "long";
        public String CHOICE_4 = "int";
        public String ANSWER = CHOICE_1;
    }

    public class Q7 {
        public String QUESTION = "A numeric data type which occupies 64 bits and holds double precision floating point numbers.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "float";
        public String CHOICE_2 = "short";
        public String CHOICE_3 = "double";
        public String CHOICE_4 = "int";
        public String ANSWER = CHOICE_3;
    }

    public class Q8 {
        public String QUESTION = "A 16-bit Unicode character which holds values from 0 to 65,535 or a single character. This is usually surrounded by single quotations (').";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "string";
        public String CHOICE_2 = "char";
        public String CHOICE_3 = "float";
        public String CHOICE_4 = "double";
        public String ANSWER = CHOICE_2;
    }

    public class Q9 {
        public String QUESTION = "What type of data is the following?";
        public String EXAMPLE  = "quotient = 5.21235465789451d;";
        public String CHOICE_1 = "short";
        public String CHOICE_2 = "float";
        public String CHOICE_3 = "int";
        public String CHOICE_4 = "double";
        public String ANSWER = CHOICE_4;
    }

    public class Q10 {
        public String QUESTION = "What type of data is the following?";
        public String EXAMPLE  = "distance = 31L;";
        public String CHOICE_1 = "short";
        public String CHOICE_2 = "long";
        public String CHOICE_3 = "double";
        public String CHOICE_4 = "char";
        public String ANSWER = CHOICE_2;
    }

   

    public Q1 Q1   = new Q1();
    public Q2 Q2   = new Q2();
    public Q3 Q3   = new Q3();
    public Q4 Q4   = new Q4();
    public Q5 Q5   = new Q5();
    public Q6 Q6   = new Q6();
    public Q7 Q7   = new Q7();
    public Q8 Q8   = new Q8();
    public Q9 Q9   = new Q9();
    public Q10 Q10 = new Q10();


    public int TOTAL_QUESTIONS = this.getClass().getDeclaredClasses().length;

}
