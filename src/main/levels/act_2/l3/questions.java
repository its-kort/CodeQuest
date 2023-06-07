package main.levels.act_2.l3;

public class questions {

    public class Q1 {
        public String QUESTION = "What will be the output of the following code?";
        public String EXAMPLE  = "String msg \"YES!\";\nmsg.toUpperCase();";
        public String CHOICE_1 = "Yes!";
        public String CHOICE_2 = "YES!";
        public String CHOICE_3 = "yes!";
        public String CHOICE_4 = "Erorr";
        public String ANSWER = CHOICE_2;
    }

    public class Q2 {
        public String QUESTION = "Returns the number of characters in the string.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".number()";
        public String CHOICE_2 = ".count()";
        public String CHOICE_3 = ".length()";
        public String CHOICE_4 = ".size()";
        public String ANSWER = CHOICE_3;
    }

    public class Q3 {
        public String QUESTION = "Returns true if the string is an empty string, and false if otherwise.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".empty()";
        public String CHOICE_2 = ".setEmpty()";
        public String CHOICE_3 = ".isEmpty()";
        public String CHOICE_4 = ".checkEmpty()";
        public String ANSWER = CHOICE_3;
    }

    public class Q4 {
        public String QUESTION = "Which string method should be used to check if the first letter of the string is J?";
        public String EXAMPLE  = "String name = \"Jane Doe\";\nname.______;";
        public String CHOICE_1 = ".getFirst(\"J\")";
        public String CHOICE_2 = ".startsWith(\"J\")";
        public String CHOICE_3 = ".beginsWith(\"J\")";
        public String CHOICE_4 = ".start(\"J\")";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "Removes leading and trailing white spaces in the string.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".trim()";
        public String CHOICE_2 = ".remove()";
        public String CHOICE_3 = ".cut()";
        public String CHOICE_4 = ".delete()";
        public String ANSWER = CHOICE_1;
    }

    public class Q6 {
        public String QUESTION = "Returns true if the string ends with the String value assigned in the method.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".getLast()";
        public String CHOICE_2 = ".endWith()";
        public String CHOICE_3 = ".endsWith()";
        public String CHOICE_4 = ".ending()";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "What is the output of the code below?";
        public String EXAMPLE  = "String text = \"No!           \";\ntext.trim();";
        public String CHOICE_1 = "N o !";
        public String CHOICE_2 = "No!";
        public String CHOICE_3 = "No !";
        public String CHOICE_4 = "No";
        public String ANSWER = CHOICE_2;
    }

    public class Q8 {
        public String QUESTION = "Converts the string into uppercase alphabetical characters.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".capital()";
        public String CHOICE_2 = ".capitalize()";
        public String CHOICE_3 = ".toUppercase()";
        public String CHOICE_4 = ".toUpperCase()";
        public String ANSWER = CHOICE_4;
    }

    public class Q9 {
        public String QUESTION = "What is the output of the following code?";
        public String EXAMPLE  = "String name = \"Hello!\";\nname.length();";
        public String CHOICE_1 = "3";
        public String CHOICE_2 = "4";
        public String CHOICE_3 = "5";
        public String CHOICE_4 = "6";
        public String ANSWER = CHOICE_4;
    }

    public class Q10 {
        public String QUESTION = "Returns true if the string begins with the String value assigned in the method.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = ".getBeginning()";
        public String CHOICE_2 = ".startWith()";
        public String CHOICE_3 = ".startssWith()";
        public String CHOICE_4 = ".start()";
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
