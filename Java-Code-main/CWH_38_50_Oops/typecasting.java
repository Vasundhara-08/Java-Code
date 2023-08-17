package CWH_38_50_Oops;

public class typecasting {
    public static void main(String[] args) {
        //type casting
        float a = (int)(56);
        System.out.println("a = " + a);

        //automatic type promotion in expressions
        int b = 250;
        byte c = (byte) (b);
        System.out.println("c = " + c);

        // converting int or any other value to string
        // there are three ways
        String s = Integer.toString(b);
        String p = "" + b;
        String q = String.valueOf(b);
        System.out.println("s = " + s);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        if(b==Integer.parseInt(s)) {
            System.out.println("good job");
        }
            else{
            System.out.println("bad job");
        }

        // byte to double conversion
        byte e =3;
        byte f =4;
        byte g =5;
        double h = (e*f) /g;
        System.out.println("h = " + h);

        // char converted to int by below instruction
        int number = 'v';
        System.out.println(number);

        // showing the value of the biggest data type
        byte u = 42;
        char v = 'a';
        short w = 1024;
        int x = 50000;
        float y = 5.67f;
        double z = .1234;
        double result = (u * v) + (w / x) - (y * z);
        // float + int - double = double
        System.out.println((u * v) + " + " + (w / x) + " - " + (y * z));
        System.out.println("result = " + result);
    }
}