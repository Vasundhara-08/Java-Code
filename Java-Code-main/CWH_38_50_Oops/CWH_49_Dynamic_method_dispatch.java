package CWH_38_50_Oops;

class Phone {

    public void on() {
        System.out.println("Turning on Phone ... ");
    }

    public void hello() {
        System.out.println("This is hello method in class Phone");
    }
}

class Smartphone extends Phone {

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone ... ");
    }

    public void hello2() {
        System.out.println("This is hello2 method in class Smartphone");
    }
}

public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone f1 = new Phone();  // valid syntax
        f1.hello();
        Smartphone f2 = new Smartphone();  // valid syntax
        f2.on();

        // if refrence is of superclass and object is of subclass than it is possible
        // which means super class ref = object of subclass but nnot vice versa
        Phone obj = new Smartphone(); // valid syntax
        // secondth obj1 = new one(); // invalid syntax

        // in case of overriding func our obj of smartphone was created so method os smartphone was called
        obj.on();
        obj.hello();
        //   obj.hello2(); // invalid syntax

    }
}
