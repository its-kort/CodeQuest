package main.levels.act_1.l3;

public class questions {

    public class Q1 {
        public String QUESTION = "Which operator returns the difference of two operands?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Addition (+)";
        public String CHOICE_2 = "Subtraction (-)";
        public String CHOICE_3 = "Multiplication (*)";
        public String CHOICE_4 = "Division (/)";
        public String ANSWER = CHOICE_2;
    }

    public class Q2 {
        public String QUESTION = "What does the modulus operator ( % ) do?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Multiplies the operands and divides it";
        public String CHOICE_2 = "Divides the operands and multiplies it";
        public String CHOICE_3 = "Increases the value of the operand by one";
        public String CHOICE_4 = "Returns the remainder of the quotient of the operands";
        public String ANSWER = CHOICE_4;
    }

    public class Q3 {
        public String QUESTION = "What will be the result of the following code?";
        public String EXAMPLE  = "int x = 2; int y = 2;\n\nx * y;";
        public String CHOICE_1 = "2";
        public String CHOICE_2 = "3";
        public String CHOICE_3 = "4";
        public String CHOICE_4 = "Error";
        public String ANSWER = CHOICE_3;
    }

    public class Q4 {
        public String QUESTION = "What is the symbol for the assignment operator?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "+";
        public String CHOICE_2 = "-";
        public String CHOICE_3 = "%";
        public String CHOICE_4 = "=";
        public String ANSWER = CHOICE_4;
    }

    public class Q5 {
        public String QUESTION = "What is the operand of the following line of code?";
        public String EXAMPLE  = "String name = \"John Doe\";";
        public String CHOICE_1 = "String";
        public String CHOICE_2 = "name";
        public String CHOICE_3 = "=";
        public String CHOICE_4 = "John Doe";
        public String ANSWER = CHOICE_4;
    }

    public class Q6 {
        public String QUESTION = "What is the operator of the following line of code?";
        public String EXAMPLE  = "String name = \"John Doe\";";
        public String CHOICE_1 = "String";
        public String CHOICE_2 = "name";
        public String CHOICE_3 = "=";
        public String CHOICE_4 = "John Doe";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "It is an operator in which it increases the operand by one.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "increment ( ++ )";
        public String CHOICE_2 = "decrement ( -- )";
        public String CHOICE_3 = "increasement ( ++ )";
        public String CHOICE_4 = "decreasement ( -- )";
        public String ANSWER = CHOICE_1;
    }

    public class Q8 {
        public String QUESTION = "It divides the left and right-hand side operands and returns the resulting remainder.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Modulus ( % )";
        public String CHOICE_2 = "Division ( / )";
        public String CHOICE_3 = "Multiplication ( * )";
        public String CHOICE_4 = "Addition ( + )";
        public String ANSWER = CHOICE_1;
    }

    public class Q9 {
        public String QUESTION = "What will be the result of the following code?";
        public String EXAMPLE  = "int x = 2; int y = 4;\n\nx - y;";
        public String CHOICE_1 = "2";
        public String CHOICE_2 = "4";
        public String CHOICE_3 = "-2";
        public String CHOICE_4 = "-4";
        public String ANSWER = CHOICE_3;
    }

    public class Q10 {
        public String QUESTION = "It is the data that will be manipulated by the operator.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Operator";
        public String CHOICE_2 = "Operand";
        public String CHOICE_3 = "Operation";
        public String CHOICE_4 = "None of the options";
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
