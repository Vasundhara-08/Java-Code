package CWH_38_61_Oops_part1;

class Fruits {
    int code;
    String name;

    // now here we can use constructor and it is named same as its class
    // constructor called without explixity invocation it get
    // called implicitly while reading same name of class in main function

    // constructor overloading with different parameter name
    // 1. Constructor with no parameters
    public Fruits() {
            code = 45;
            name = "Mango";
        }

    // 2. Constructor with two parameters
    // now here we can also pass constructor using arguments
    public Fruits(int code , String frname) {
        this.code = code;
        name = frname;
    }

    // 3. Constructor with one parameter
    public Fruits(int digit ) {
        code = digit;
    }

    public void setcode(int x) {
        code = x;
    }

    public int getcode() {
        return code;    // return statement is imp for printing the result
    }

    public void setname(String y) {
        name = y;
    }

    public String getname() {
        return name;
    }
}

public class CWH_42_constructors {
    public static void main(String args[]) {
        Fruits fr1 = new Fruits(8,"banana");
        Fruits fr2 = new Fruits(6);
        Fruits fr = new Fruits(38,"pear");


        fr.setcode(20);
        fr.setname("Grapes");
        // what if we have a lot of properties to engage with and to avoid large
        // num of code to be written we simplify it using Constructors :-
        // Constructor is a memeber function used to initialize an object while creating it

        // now without using the above setcode we can directly call the getcode method with use of constructor
        System.out.println(fr.getcode() + fr.getname());
        System.out.println(fr.getcode());
        System.out.println(fr1.getcode() + fr1.getname());


    }
}
