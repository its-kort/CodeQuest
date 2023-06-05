package main.levels.act_1.l1;

public class questions {

    public class Q1 {
        public String QUESTION = "It is a program that transforms a written programming language into a code that can be understood by the computer\'s processor.";
        public String CHOICE_1 = "Compiler";
        public String CHOICE_2 = "Software";
        public String CHOICE_3 = "Application";
        public String CHOICE_4 = "Translator";
        public String ANSWER = CHOICE_1;
    }

    public class Q2 {
        public String QUESTION = "A unique name that identifies an element in a program.";
        public String CHOICE_1 = "Identifier";
        public String CHOICE_2 = "Variable";
        public String CHOICE_3 = "Statement";
        public String CHOICE_4 = "Method";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "A programmer-assigned name for a specific address, which holds data, in the computer\'s memory.";
        public String CHOICE_1 = "Label";
        public String CHOICE_2 = "Asset";
        public String CHOICE_3 = "Container";
        public String CHOICE_4 = "Variable";
        public String ANSWER = CHOICE_4;
    }

    public class Q4 {
        public String QUESTION = "Information that is stored digitally.";
        public String CHOICE_1 = "Value";
        public String CHOICE_2 = "Data";
        public String CHOICE_3 = "Array";
        public String CHOICE_4 = "Content";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "A numeric data type which occupies 8 bits and holds integer values from -128 to 127.";
        public String CHOICE_1 = "Character";
        public String CHOICE_2 = "Integer";
        public String CHOICE_3 = "Byte";
        public String CHOICE_4 = "Decimal";
        public String ANSWER = CHOICE_3;
    }


    public Q1 Q1 = new Q1();
    public Q2 Q2 = new Q2();
    public Q3 Q3 = new Q3();
    public Q4 Q4 = new Q4();
    public Q5 Q5 = new Q5();

    public int TOTAL_QUESTIONS = this.getClass().getDeclaredClasses().length;

}
