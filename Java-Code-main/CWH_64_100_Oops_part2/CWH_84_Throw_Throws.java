package CWH_64_100_Oops_part2;

class NegativeRadiusException extends Exception
{
    public String toString(){
        return "Radius cannot be negative";
}

public String getMessage(){
        return "Enter a positive value only !!!";
}

}

public class CWH_84_Throw_Throws {

    // for this i will create my own custom exception
    public static double circle(int r) throws NegativeRadiusException
    {
            if (r<0)
            {
                throw new NegativeRadiusException();
            }

        double areeea =  Math.PI * r * r;
        return areeea;
    }

    // throws keyword is used to declare that there might be an exception
    public static int divide (int a ,int b) throws ArithmeticException
    {
        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        try
        {
//        int c =  divide(56,7);
//        System.out.println("The divident of both the numbers are :- " + c);

        double cir = circle (-5);
            System.out.println("The circle area becomes :- " + cir);
        }

        // catch block for divide exception
//        catch (Exception e )
//        {
//            System.out.println("Exception");
//        }

        catch (NegativeRadiusException e){
            System.out.println("This throws exception :- " + e);
            System.out.println(e.getMessage());
        }


    }
}
