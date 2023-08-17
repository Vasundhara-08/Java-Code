package CWH_01_24_basics;

public class CWH_08_Operators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

// 1 //    System.out.println(a++); // a++ = 8 , a++ = 9 , a++ = 10
// 2 //    System.out.println(++a); // ++a = 9 , ++a = 10 , ++a = 11

// 3 // System.out.println(a++);   // 8
//      System.out.println(a);     // 9
//      System.out.println(++a);   // 10

// 4 // System.out.println(b--);   // 5
//      System.out.println(b);     // 4
//      System.out.println(--b);   // 3


// 5 // bitwise operator
        System.out.println(2 & 3);  // 10 + 11 = 10 (2)
        System.out.println(34|56);  // 58
        System.out.println(1000&1110); // 64

    }
}

//  Associative Operator -> + , - , * , / , % , ++ , --
//  Assignment Operator  -> = , +=
//  Comparison Operator  -> == , >= , <=
//  Logical Operator     -> && , || , !
//  Bitwise Operator     -> & , | (Operates bitwise like OR ,AND)