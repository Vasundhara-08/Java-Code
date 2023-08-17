package CWH_38_50_Oops;

class uses {
    int c;

    uses(int c) {
        // 1. "this" refers to the instance variable "c"
        // 2. "this" helps differentiate between parameter and instance variable
        // hence it avoids ambiguity
        // 3. this is a refrence of an object of a class
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public int none() {
        return 1;
    }
}

class second extends uses{
    int d ;

    second(int c)
    {
        // 1 . a referenec variable used to refer immediate parent class object
        // 2. it may invoke parent class variable ,method or constrcutors
        super(9);
        System.out.println("This is derived class named as second");
    }

}

public class CWH_47_this_super {

    public static void main(String[] args) {
        uses key = new uses(8);
        System.out.println(key.getC());

        second key2 = new second(6);

    }
}
