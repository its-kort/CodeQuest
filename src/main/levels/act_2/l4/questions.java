package main.levels.act_2.l4;

public class questions {

    public class Q1 {
        public String QUESTION = "A keyword that is used to modify the behavior or characteristics of classes, methods, variables, and other program elements. They also control access, visibility, and other aspects of these elements.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Class";
        public String CHOICE_2 = "Object";
        public String CHOICE_3 = "Modifier";
        public String CHOICE_4 = "Method";
        public String ANSWER = CHOICE_3;
    }

    public class Q2 {
        public String QUESTION = "The blueprint from which individual objects are made.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Class";
        public String CHOICE_2 = "Object";
        public String CHOICE_3 = "Modifier";
        public String CHOICE_4 = "Method";
        public String ANSWER = CHOICE_1;
    }

    public class Q3 {
        public String QUESTION = "An instance of a class, where each object have different states or behaviors.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "Class";
        public String CHOICE_2 = "Object";
        public String CHOICE_3 = "Modifier";
        public String CHOICE_4 = "Method";
        public String ANSWER = CHOICE_2;
    }

    public class Q4 {
        public String QUESTION = "Applies to methods and variables to make them belong to the class rather than instances of the class.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "static";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "volatile";
        public String CHOICE_4 = "transient";
        public String ANSWER = CHOICE_1;
    }

    public class Q5 {
        public String QUESTION = "Indicates that a variable may be accessed by multiple threads and should not be cached.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "static";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "volatile";
        public String CHOICE_4 = "transient";
        public String ANSWER = CHOICE_3;
    }

    public class Q6 {
        public String QUESTION = "Specifies that a variable should not be serialized.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "static";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "volatile";
        public String CHOICE_4 = "transient";
        public String ANSWER = CHOICE_4;
    }

    public class Q7 {
        public String QUESTION = "Indicates that a variable cannot be modified or a class cannot be subclassed.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "abstract";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "public";
        public String CHOICE_4 = "private";
        public String ANSWER = CHOICE_2;
    }

    public class Q8 {
        public String QUESTION = "This restricts access to only be used within the same class.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "abstract";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "public";
        public String CHOICE_4 = "private";
        public String ANSWER = CHOICE_4;
    }

    public class Q9 {
        public String QUESTION = "Applies to classes or methods and indicates that they have no implementation and must be overridden in subclasses.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "abstract";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "public";
        public String CHOICE_4 = "private";
        public String ANSWER = CHOICE_1;
    }

    public class Q10 {
        public String QUESTION = "This allows access from anywhere.";
        public String EXAMPLE  = null;
        public String CHOICE_1 = "abstract";
        public String CHOICE_2 = "final";
        public String CHOICE_3 = "public";
        public String CHOICE_4 = "private";
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
