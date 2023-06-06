package main.levels.act_1.l5;

public class questions {

    public class Q1 {
        public String QUESTION = "What operand is used in the following line of code?";
        public String EXAMPLE  = "x == y;";
        public String CHOICE_1 = "Equals to";
        public String CHOICE_2 = "Equivalent to";
        public String CHOICE_3 = "Equal to";
        public String CHOICE_4 = "Equals";
        public String ANSWER = CHOICE_3;
    }

    public class Q2 {
        public String QUESTION = "This operator returns true if both operands are evaluated to be true.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "AND (&&)";
        public String CHOICE_2 = "AT (&&)";
        public String CHOICE_3 = "OR (||)";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "This determines if the left operand is not equal to the right operand.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "<=";
        public String CHOICE_2 = ">=";
        public String CHOICE_3 = "!=";
        public String CHOICE_4 = "==";
        public String ANSWER = CHOICE_3;
    }

    public class Q4 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 5; int y = 10;\n\nx > y;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 10; int y = 10;\n\nx <= y;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
    }

    public class Q6 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 20; int y = 9; int z = 3;\n\nx > y || y < 3;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
    }

    public class Q7 {
        public String QUESTION = "This determines whether one operand is less than, equal to, or greater than the other.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Arithmetic Operators";
        public String CHOICE_2 = "Relational Operators";
        public String CHOICE_3 = "Conditional Operators";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_2;
    }

    public class Q8 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 5; int y = 10;\n\nx < y && y > x;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
    }

    public class Q9 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 3; int y = 3;\n\nx < y;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_2;
    }

    public class Q10 {
        public String QUESTION = "What is the result of the following code?";
        public String EXAMPLE  = "int x = 0; int y = -1;\nx > y;";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Error";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
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
