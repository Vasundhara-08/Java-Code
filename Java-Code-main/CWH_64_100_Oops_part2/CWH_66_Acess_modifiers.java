package CWH_64_100_Oops_part2;

class vasundhara {
    public int x = 34;
    private int y = 45;
    protected int u = 0;
    int z = 8;

    void meth1() {
        // Case 1 : all 4 modifiers can be accessed in same class
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(u);
//        System.out.println(z);
    }
}

    class Saksham extends vasundhara{
        @Override
        void meth1() {

            // Case 3:- here default is accessible only because of inheritance in same class  but if there
            // is inheritence in other package then default is not accessible by any other class of other package

            // note : if subclass is of another package then it cannoot call defaul and private
            System.out.println(x);
//            System.out.println(y);
            System.out.println(z=9);
            System.out.println(u);
        }

        class Riya{

            // Case 4 : for other class in same pacakge private not accesible
            void meth1(){
                System.out.println(x);
//                System.out.println(y);
                System.out.println(z);
                System.out.println(u);
            }
        }

        // Case 5 : if i import different pcakge in this package and try calling all modifiers of
        // that package in a class then only public modifier will be called but in case of subclass i can also call protected
}


public class CWH_66_Acess_modifiers {
    public static void main(String[] args) {
        vasundhara v1 = new vasundhara();
        v1.meth1();

        Saksham sk = new Saksham();
        sk.meth1();

        // Case 2 : for same package private cannot be accessed
//        System.out.println(v1.x);
////        System.out.println(v1.y);  // not allowed as it is private
//        System.out.println(v1.z);
//        System.out.println(v1.u);



    }


}
