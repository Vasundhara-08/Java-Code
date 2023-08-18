package CWH_38_61_Oops_part1;


 abstract class Mother{
   public Mother(){
       System.out.println("This is a constructor of class mother ");
   }
   public void func(){
       System.out.println("This is a method called in class mother");
   }
   abstract public void greet1(); // we created a method abstract so becz of it class becomes abstract
      abstract public void greet2();
}

/*  There are two ways to extends abstract class either override the abstract method of the parent abstract
    class or defined the child class with abstract keyword in its class .This all is because abstract class
    can never make an object because abstract class is a standard to make other classes  */


// 1. Overriding a class
class Child1 extends Mother{
    @Override
    public void greet1()
    {
        System.out.println("Good morning");
    }
    @Override
    public void greet2()
    {
        System.out.println("Good afternoon");
    }
}

// making class as abstract
abstract  class Child2 extends Mother{
    public void ch(){
        System.out.println("This is child 2 class with abstract ");
    }
}

public class CWH_53_Abstract_Class {
    public static void main(String[] args) {
        // abstract means existing in thought or an idea but not having a physical excistence
        // 1. An abstract class declared with abstract name and it may or may not contain abstract methods
        // 2. abstract class cannot be instatiated but they can be subclassed
        // 3. An abstract method is declared without braces and followed by semicolon

      Child1 c = new Child1(); // valid
//      Child2 c2 = new Child2() ; // invalid
//      Mother m1 = new Mother() ; // invalid

    }
}
