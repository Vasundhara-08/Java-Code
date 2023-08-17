package CWH_38_50_Oops;

class Base {
    int x;

    Base()
    {
        System.out.println("This is base class constructor");
    }

    Base(int z)
    {
        System.out.println("This is an overloaded constructor with arg 1 :- " + z);
    }

    public void setX(int x) {
        System.out.println("I am setting x now by Base class :- ");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printme() {
        System.out.println("This is a method");
    }
}

class Derived extends Base {  // subclass extends superclass
    int y;

    // 1. for constructor if derived class is not having then it will automatically invoke base class constructor
    // 2. but if derived class have constructor then it will run both constructors
    // 3. also first base constructor is called and then derived class

    Derived()
    {
        // giving value of argument we can call the type of constructor that we  want to run from base class
        super(0);
        System.out.println("This is derived class constructor");
    }

    Derived(int f , int k)
    {
        super(89);
        System.out.println("This is derived class constructor ");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());

        // 1. derived can also fetch variable of base class
        Derived d = new Derived();
        d.setX(56);
        System.out.println(d.getX());

        // 2. derived class arguments can also be given here
        Derived e = new Derived(4,9);

    }
}

// 1. java does not support multiple inheritance
