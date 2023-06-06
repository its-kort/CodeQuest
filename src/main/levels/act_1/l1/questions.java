package main.levels.act_1.l1;

public class questions {

    public class Q1 {
        public String QUESTION = "It is a program that transforms a written programming language into a code that can be understood by the computer\'s processor.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Compiler";
        public String CHOICE_2 = "Software";
        public String CHOICE_3 = "Application";
        public String CHOICE_4 = "Translator";
        public String ANSWER = CHOICE_1;
    }

    public class Q2 {
        public String QUESTION = "A unique name that identifies an element in a program.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Identifier";
        public String CHOICE_2 = "Variable";
        public String CHOICE_3 = "Statement";
        public String CHOICE_4 = "Method";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "A programmer-assigned name for a specific address, which holds data, in the computer\'s memory.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Label";
        public String CHOICE_2 = "Asset";
        public String CHOICE_3 = "Container";
        public String CHOICE_4 = "Variable";
        public String ANSWER = CHOICE_4;
    }

    public class Q4 {
        public String QUESTION = "A class-based, object-oriented programming language based on C and C++. It is a high-level language that is easy to read and understand.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "JavaScript";
        public String CHOICE_2 = "C#";
        public String CHOICE_3 = "Java";
        public String CHOICE_4 = "Python";
        public String ANSWER = CHOICE_3;
    }

    public class Q5 {
        public String QUESTION = "A numeric data type which occupies 8 bits and holds integer values from -128 to 127.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Hexadecimal";
        public String CHOICE_2 = "Bit";
        public String CHOICE_3 = "Byte";
        public String CHOICE_4 = "Decimal";
        public String ANSWER = CHOICE_3;
    }

    public class Q6 {
        public String QUESTION = "What is the following line of code?";
        public String EXAMPLE  = "int name = \"John Doe\";";
        public String CHOICE_1 = "Data";
        public String CHOICE_2 = "Statement";
        public String CHOICE_3 = "Method";
        public String CHOICE_4 = "Variable";
        public String ANSWER = CHOICE_4;
    }

    public class Q7 {
        public String QUESTION = "What is the identifier in the following code block?";
        public String EXAMPLE  = "public class main {\n\n}";
        public String CHOICE_1 = "main";
        public String CHOICE_2 = "class";
        public String CHOICE_3 = "public";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_1;
    }

    public class Q8 {
        public String QUESTION = "Information that is stored digitally.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Value";
        public String CHOICE_2 = "Data";
        public String CHOICE_3 = "Array";
        public String CHOICE_4 = "Content";
        public String ANSWER = CHOICE_2;
    }

    public class Q9 {
        public String QUESTION = "Identifiers cannot start with ________";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Symbols";
        public String CHOICE_2 = "Digits";
        public String CHOICE_3 = "Characters";
        public String CHOICE_4 = "None of the options";
        public String ANSWER = CHOICE_2;
    }

    public class Q10 {
        public String QUESTION = "Who invented the Java programming language?";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "James Gosling";
        public String CHOICE_2 = "Steve Jobs";
        public String CHOICE_3 = "Bill Gates";
        public String CHOICE_4 = "Tim Berners-Lee";
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
