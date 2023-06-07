package main.levels.act_2.l2;

public class questions {

    public class Q1 {
        public String QUESTION = "Executes the statement then evaluate the boolean expression, then repeatedly executes the statement if the expression is true until the expression returns false.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Loop";
        public String CHOICE_2 = "while statement";
        public String CHOICE_3 = "do-while statement";
        public String CHOICE_4 = "for statement";
        public String ANSWER = CHOICE_3;
    }

    public class Q2 {
        public String QUESTION = "A block of code to be executed a number of times based on a certain condition.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Loop";
        public String CHOICE_2 = "while statement";
        public String CHOICE_3 = "do-while statement";
        public String CHOICE_4 = "for statement";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "Evaluates a boolean expression and repeatedly executes the statement if the expression is true until the expression returns false.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Loop";
        public String CHOICE_2 = "while statement";
        public String CHOICE_3 = "do-while statement";
        public String CHOICE_4 = "for statement";
        public String ANSWER = CHOICE_2;
    }

    public class Q4 {
        public String QUESTION = "Specifies an initialization statement, condition for execution, and increment statement.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Loop";
        public String CHOICE_2 = "while statement";
        public String CHOICE_3 = "do-while statement";
        public String CHOICE_4 = "for statement";
        public String ANSWER = CHOICE_4;
    }

    public class Q5 {
        public String QUESTION = "Complete the code below.";
        public String EXAMPLE  = "int num = 10;\nfor (int i = 1; i < num; i++) {\n    System.out.println(___);\n}";
        public String CHOICE_1 = "num";
        public String CHOICE_2 = "10";
        public String CHOICE_3 = "i";
        public String CHOICE_4 = "1";
        public String ANSWER = CHOICE_3;
    }

    public class Q6 {
        public String QUESTION = "What will be the output of the code below?";
        public String EXAMPLE  = "int num = 10;\nfor (int i = 1; i < num; i++) {\n    System.out.println(i);\n}";
        public String CHOICE_1 = "1 2 3";
        public String CHOICE_2 = "1 2 3 4 5 6";
        public String CHOICE_3 = "1 2 3 4 5 6 7 8 9";
        public String CHOICE_4 = "1 2 3 4 5 6 7 8 9 10";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "Complete the code below.";
        public String EXAMPLE  = "___ (num1 > num2) {\n    System.out.println(num1);\n}";
        public String CHOICE_1 = "loop";
        public String CHOICE_2 = "while";
        public String CHOICE_3 = "do-while";
        public String CHOICE_4 = "for";
        public String ANSWER = CHOICE_2;
    }

    public class Q8 {
        public String QUESTION = "Which of the following is the correct for loop statement?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "for (i; i++)";
        public String CHOICE_2 = "for (int i = 1; i++)";
        public String CHOICE_3 = "for (int i = 1; i < 5; i)";
        public String CHOICE_4 = "for (int i = 1; i < 5; i++)";
        public String ANSWER = CHOICE_4;
    }

    public class Q9 {
        public String QUESTION = "Complete the code below.";
        public String EXAMPLE  = "for (_____; _____; _____) {\n    System.out.println(i);\n}";
        public String CHOICE_1 = "i = 10; i < 20; i+i";
        public String CHOICE_2 = "int i = 10; i < 20; i";
        public String CHOICE_3 = "int i + 10; i < 20; i++";
        public String CHOICE_4 = "int i = 10; i < 20; i++";
        public String ANSWER = CHOICE_4;
    }

    public class Q10 {
        public String QUESTION = "Complete the code below.";
        public String EXAMPLE  = "_____ {\n    System.out.println(\"Correct!\");\n} _____ (answer)";
        public String CHOICE_1 = "do, while";
        public String CHOICE_2 = "while, do";
        public String CHOICE_3 = "while, if";
        public String CHOICE_4 = "if, while";
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
