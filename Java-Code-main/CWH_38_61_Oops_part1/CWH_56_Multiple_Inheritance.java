package CWH_38_61_Oops_part1;

// In java we don't use the concept of multiple inheritance directly but we do the same indirectly using interfaces.
// when a class inherits from multiple classes, there could be conflicts in method and field names, leading to ambiguity

interface Parent11 {
    void showMessage1();
}

interface Parent22 {
    void showMessage2();
}

class Child implements Parent11, Parent22 {
    public void showMessage1() {
        System.out.println("Message from Parent1");
    }

    public void showMessage2() {
        System.out.println("Message from Parent2");
    }
}

public class CWH_56_Multiple_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage1();
        child.showMessage2();
    }
}
