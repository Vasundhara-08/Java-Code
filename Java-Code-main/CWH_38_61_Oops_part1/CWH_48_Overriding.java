package CWH_38_61_Oops_part1;

class A {
    public int z=1;



    public int meth1() {
        do {
            System.out.println(z);
            z++;
        }
        while (z!=8);
        return 1000000;
    }

    public void meth2() {
        System.out.println("This is second method of class A");
    }
}

class B extends A {
   // same name of method as earlier defined in class A
    public void meth2() {
        System.out.println("This is second method of class B");
    }

    public void meth3() {
        System.out.println("This is third method of class B");
    }
}

public class CWH_48_Overriding {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.meth1());

        B b = new B();
        b.meth2();    // method overirdes
    }
}

// 1. you cannot override static and final method
