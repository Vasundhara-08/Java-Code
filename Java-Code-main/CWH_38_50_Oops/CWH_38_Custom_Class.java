package CWH_38_50_Oops;

// there is only one public class in java
class Exam {

    // objects of class
    int num;
    String name;
    int marks_total;

    // creating method of class using void
    public void more()
    {
        System.out.println("Second num :- " + num);
        System.out.println("Second name :- " + name);
    }

    // creating method of class using int
    public int marks()
    {
        return marks_total;
    }
}

public class CWH_38_Custom_Class {

    public static void main(String[] args) {
        System.out.println("This is main method");

        // Instantiation of new Exam object
        Exam details = new Exam();
        Exam sec_details = new Exam();

        // setting attributes
        details.num = 23;
        details.name = "Maths";
        details.marks_total = 90;

        sec_details.num = 24;
        sec_details.name = "English";
        sec_details.marks_total = 70;

        // calling above defined method
        int total_marks = details.marks_total;
        System.out.println(total_marks);
        sec_details.more();

        System.out.println("First num :- " + details.num);
        System.out.println("First name :- " + details.name);

    }
}
