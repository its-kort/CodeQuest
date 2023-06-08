package main.levels.act_3.l2;

public class questions {

    public class Q1 {
        public String QUESTION = "An Exception class where it returns arithmetic errors such as division by 0.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "ArithmeticException";
        public String CHOICE_2 = "FileNotFoundException";
        public String CHOICE_3 = "NullPointerException";
        public String CHOICE_4 = "NumberFormatException";
        public String ANSWER = CHOICE_1;
    }

    public class Q2 {
        public String QUESTION = "Reference to an object that has not been instantiated.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "InputMismatchException";
        public String CHOICE_2 = "FileNotFoundException";
        public String CHOICE_3 = "NullPointerException";
        public String CHOICE_4 = "NumberFormatException";
        public String ANSWER = CHOICE_3;
    }

    public class Q3 {
        public String QUESTION = "Use of an illegal number format.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "InputMismatchException";
        public String CHOICE_2 = "FileNotFoundException";
        public String CHOICE_3 = "NullPointerException";
        public String CHOICE_4 = "NumberFormatException";
        public String ANSWER = CHOICE_4;
    }

    public class Q4 {
        public String QUESTION = "Reference to a file that cannot be found.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "InputMismatchException";
        public String CHOICE_2 = "FileNotFoundException";
        public String CHOICE_3 = "NullPointerException";
        public String CHOICE_4 = "NumberFormatException";
        public String ANSWER = CHOICE_2;
    }

    public class Q5 {
        public String QUESTION = "If the next input (toxen) is not an Integer, or is out of range.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "InputMismatchException";
        public String CHOICE_2 = "FileNotFoundException";
        public String CHOICE_3 = "NullPointerException";
        public String CHOICE_4 = "NumberFormatException";
        public String ANSWER = CHOICE_1;
    }

    public class Q6 {
        public String QUESTION = "Finds a block of code called an exception handler that can manage a specific type of exception.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Exceptions";
        public String CHOICE_2 = "try block";
        public String CHOICE_3 = "catch block";
        public String CHOICE_4 = "finally block";
        public String ANSWER = CHOICE_3;
    }

    public class Q7 {
        public String QUESTION = "Identifies a block of code which will execute.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Exceptions";
        public String CHOICE_2 = "try block";
        public String CHOICE_3 = "catch block";
        public String CHOICE_4 = "finally block";
        public String ANSWER = CHOICE_4;
    }

    public class Q8 {
        public String QUESTION = "These are problems or errors that occur during execution of a program. It disrupts the normal flow or operation of a program or application, forcing it to terminate abnormally.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Exceptions";
        public String CHOICE_2 = "try block";
        public String CHOICE_3 = "catch block";
        public String CHOICE_4 = "finally block";
        public String ANSWER = CHOICE_1;
    }

    public class Q9 {
        public String QUESTION = "Finds a block of code in which an exception can take place.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Exceptions";
        public String CHOICE_2 = "try block";
        public String CHOICE_3 = "catch block";
        public String CHOICE_4 = "finally block";
        public String ANSWER = CHOICE_2;
    }

    public class Q10 {
        public String QUESTION = "Complete the following code.";
        public String EXAMPLE  = "public class Main {\n  public static void main(String[] args) {\n     ____ {\n        int x = 5/0; \n        System.out.println(x):\n     }\n\n     catch(___________ e) \n     {\n        System.out.println(\"Error! Cannot divide by zero.\");\n     }\n\n     ______\n     {\n        System.out.println(\"The try-catch block execution has been finished.\");\n     }\n  }\n}";
        public String CHOICE_1 = "try, catch, finally";
        public String CHOICE_2 = "try, Exception, finally";
        public String CHOICE_3 = "try, Error, finally";
        public String CHOICE_4 = "try, ArithmeticException, finally";
        public String ANSWER = CHOICE_4;
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
