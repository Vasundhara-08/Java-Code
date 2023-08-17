package CWH_38_50_Oops;

/*
 * Here we will discuss different type of Variables available in Java
 */
public class VariableTypes {

    /*
     * Below variable is STATIC variable :-
     * declared outside any method.
     * using STATIC modifier with it.
     * uses access modifier for declaring variables.
     */
    static String staticField;
    /*
     * Below variable is INSTANCE VARIABLE :-
     *  as it is outside any method
     * not using STATIC modifier with it.
     *  It is using default access modifier.
     */
    int instanceField;

    public static void main(String args[]) {
        VariableTypes obj = new VariableTypes();

        /*
         * Instance variable can only be accessed by Object of the class only as below.
         */
        System.out.println(obj.instanceField);

        /*
         * Static field can be accessed in two way.
         * 1- Via Object of the class
         * 2- Via CLASS name
         */
        System.out.println(obj.staticField);
        System.out.println(VariableTypes.staticField);
        System.out.println(new VariableTypes().instanceField);
    }

    public void method() {
        /*
         * Below variable is LOCAL VARIABLE as it is defined inside method in
         * class. Only modifier that can be applied on local variable is FINAL.

         * Note* : Local variable needs to initialize before they can be used.
         * Which is not true for Static or Instance variable.
         */
        final String localVariable = "Initial Value";
        System.out.println(localVariable);
    }
}

