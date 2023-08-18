package CWH_38_61_Oops_part1;

interface Liquid{
    void type1();
    void type2();
}

// valid way to extend an interface
interface Solid extends Liquid{
    void type3();
    void type4();
}

// valid way to implement using class
class number implements Solid{
    public void type1(){
        System.out.println("1");
    }
    public void type2(){
        System.out.println("2");
    }
    public void type3(){
        System.out.println("3");
    }
    public void type4(){
        System.out.println("4");
    }
        }

// invalid way as class cannot be extended
// either make this as impllement or instead of class write interface
//class number2 extends Liquid{
//
//}

public class CWH_58_inheritance_in_interface {
    public static void main(String[] args) {
    number obj = new number() ;
    obj.type1();
    obj.type3();
    }
}
