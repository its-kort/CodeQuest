package main.levels.act_3.l1;

public class questions {

    public class Q1 {
        public String QUESTION = "This allows objects of different classes to be treated as objects of a common superclass. It enables methods to be invoked on objects without knowing their specific types, resulting in code that is more flexible and reusable.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Object-Oriented Programming";
        public String CHOICE_2 = "Inheritance";
        public String CHOICE_3 = "Polymorphism";
        public String CHOICE_4 = "Attribute";
        public String ANSWER = CHOICE_3;
    }

    public class Q2 {
        public String QUESTION = "This is a programming language model based on objects instead of \"actions\" and data instead of logic.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Object-Oriented Programming";
        public String CHOICE_2 = "Inheritance";
        public String CHOICE_3 = "Polymorphism";
        public String CHOICE_4 = "Attribute";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "It allows classes to inherit properties and behaviors from other classes";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Object-Oriented Programming";
        public String CHOICE_2 = "Inheritance";
        public String CHOICE_3 = "Polymorphism";
        public String CHOICE_4 = "Attribute";
        public String ANSWER = CHOICE_2;
    }

    public class Q4 {
        public String QUESTION = "What keyword is used to indicate an inheritance from a class?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "extend";
        public String CHOICE_2 = "extends";
        public String CHOICE_3 = "extending";
        public String CHOICE_4 = "extension";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "It is a block of code that only runs when it is called.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Method";
        public String CHOICE_2 = "Parameter";
        public String CHOICE_3 = "Attribute";
        public String CHOICE_4 = "Argument";
        public String ANSWER = CHOICE_1;
    }

    public class Q6 {
        public String QUESTION = "These are variables within a class that can be accessed by creating an object of the class.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Method";
        public String CHOICE_2 = "Parameter";
        public String CHOICE_3 = "Attribute";
        public String CHOICE_4 = "Argument";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "These are information passed to a method and acts as variables inside the method.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Method";
        public String CHOICE_2 = "Parameter";
        public String CHOICE_3 = "Attribute";
        public String CHOICE_4 = "Argument";
        public String ANSWER = CHOICE_2;
    }

    public class Q8 {
        public String QUESTION = "These are information passed to a parameter.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Method";
        public String CHOICE_2 = "Parameter";
        public String CHOICE_3 = "Attribute";
        public String CHOICE_4 = "Argument";
        public String ANSWER = CHOICE_4;
    }

    public class Q9 {
        public String QUESTION = "What would be output of the code below?";
        public String EXAMPLE  = "public class Main {\n   static void run() {\n      System.out.println(\"Run!\");\n   }\n\n   public static void main(String[] args) {\n      run();\n   }\n}";
        public String CHOICE_1 = "Main";
        public String CHOICE_2 = "run()";
        public String CHOICE_3 = "Run!";
        public String CHOICE_4 = "Error";
        public String ANSWER = CHOICE_3;
    }

    public class Q10 {
        public String QUESTION = "What is the argument in the following code?";
        public String EXAMPLE  = "public class Main {\n   static void sum(int num1, int num2) {\n      int sum = num1 + num2;\n      System.out.println(sum);\n   }\n\n   public static void main(String[] args) {\n      sum(20, 3);\n   }\n}";
        public String CHOICE_1 = "num1 + num2";
        public String CHOICE_2 = "20";
        public String CHOICE_3 = "23";
        public String CHOICE_4 = "3";
        public String ANSWER = CHOICE_3;
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
