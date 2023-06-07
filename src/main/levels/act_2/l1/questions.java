package main.levels.act_2.l1;

public class questions {

    public class Q1 {
        public String QUESTION = "This executes a statement if the specified condition is true, or another statement or block if the condition is false.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "if statement";
        public String CHOICE_2 = "if-else statement";
        public String CHOICE_3 = "if-else-if statement";
        public String CHOICE_4 = "switch statement";
        public String ANSWER = CHOICE_2;
    }

    public class Q2 {
        public String QUESTION = "Executes a statement if the specified condition is true.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "if statement";
        public String CHOICE_2 = "if-else statement";
        public String CHOICE_3 = "if-else-if statement";
        public String CHOICE_4 = "switch statement";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "Executes a statement of the specified condition is true. If it is false, it tests another condition or executes another statement if the other condition is true.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "if statement";
        public String CHOICE_2 = "if-else statement";
        public String CHOICE_3 = "if-else-if statement";
        public String CHOICE_4 = "switch statement";
        public String ANSWER = CHOICE_3;
    }

    public class Q4 {
        public String QUESTION = "Executes a variable or expression, then continues execution to the case stament until the case value is equal to the value of the variable.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "if statement";
        public String CHOICE_2 = "if-else statement";
        public String CHOICE_3 = "if-else-if statement";
        public String CHOICE_4 = "switch statement";
        public String ANSWER = CHOICE_4;
    }

    public class Q5 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = 1;\nif (num < 10) {\n    System.out.println(\"Less\");\n}";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Less";
        public String CHOICE_4 = "Error";
        public String ANSWER = CHOICE_3;
    }

    public class Q6 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = 1;\n\nswitch(num) {\ncase -1:\n    System.out.println(\"A\");\nbreak;\n\ncase 0:\n    System.out.println(\"B\");\nbreak;\n\ncase 1:\n    System.out.println(\"C\");\nbreak;\n\ndefault:\n    System.out.println(\"D\");\nbreak;\n}";
        public String CHOICE_1 = "A";
        public String CHOICE_2 = "B";
        public String CHOICE_3 = "C";
        public String CHOICE_4 = "D";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = 1;\nif (num > 0) {\n    System.out.println(\"Positive\");\n} else if (num < 0) {\n    System.out.println(\"Negative\");\n}";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Positive";
        public String CHOICE_4 = "Negative";
        public String ANSWER = CHOICE_3;
    }

    public class Q8 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = -2;\n\nif (num > 0) {\n    System.out.println(\"Positive\");\n} else if (num < 0) {\n    System.out.println(\"Negative\");\n}";
        public String CHOICE_1 = "True";
        public String CHOICE_2 = "False";
        public String CHOICE_3 = "Positive";
        public String CHOICE_4 = "Negative";
        public String ANSWER = CHOICE_4;
    }

    public class Q9 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = 2;\n\nswitch(num) {\ncase -1:\n    System.out.println(\"A\");\nbreak;\n \ncase 0:\n    System.out.println(\"B\");\nbreak;\n\ncase 1:\n    System.out.println(\"C\");\nbreak;\n\ndefault:\n    System.out.println(\"D\");\nbreak;\n}";
        public String CHOICE_1 = "A";
        public String CHOICE_2 = "B";
        public String CHOICE_3 = "C";
        public String CHOICE_4 = "D";
        public String ANSWER = CHOICE_4;
    }

    public class Q10 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "int num = -1;\n\nswitch(num) {\ncase -1:\n    System.out.println(\"A\");\nbreak;\n \ncase 0:\n    System.out.println(\"B\");\nbreak;\n\ncase 1:\n    System.out.println(\"C\");\nbreak;\n\ndefault:\n    System.out.println(\"D\");\nbreak;\n}";
        public String CHOICE_1 = "A";
        public String CHOICE_2 = "B";
        public String CHOICE_3 = "C";
        public String CHOICE_4 = "D";
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
