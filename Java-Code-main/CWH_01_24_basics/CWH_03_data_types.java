package CWH_01_24_basics;

public class CWH_03_data_types {
    public static void main(String[] args) {
        //    primitive - byte ,short,int ,float,long,decimal,double,char,boolean
        //                 1   ,2   ,4    , 4   ,8   , 8     , 8    ,2   , 0 or 1
        int a = 34;
        int comma = 23_34_98_009;   //printing bigger number in int instead of comma u can put underscore which is being ignored
        char alphabet = 'g';
        float marks = 98.6f;
        double longIntegerDecimal = 34567.8759827457;
        long largeInteger = 3276482659826l;
        boolean check = true;

        System.out.println(a);
        System.out.println(comma);
        System.out.println(largeInteger);
        System.out.println(alphabet);


//    non primitve - arrays ,strings

//    The Reference Data Types will contain a memory address of variable values because the
//    reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc.

      String s1 = "Vasundhara";
      String s2 = new String("Sequence of Characters");
        System.out.println(s2);
        System.out.println(s1);

    }
}
