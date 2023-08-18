package CWH_65_100_Oops_part2;

class Circle{
    public double radius;
    Circle(double r)
    {
        this.radius = r;
        System.out.println("Value of radius is given here :- " + this.radius);
    }
    public double area(){
        double ar = Math.PI * this.radius * this.radius;
        System.out.println("Area of circle ");
        return ar;
    }
}

class Cylinder extends Circle{
    public double height =9 ;
    Cylinder(double r, double h){
        super(r);
        this.height = h;
        System.out.println("Value of height is here :-" + this.height );

    }
    public double volume(){
      double v = 2 * Math.PI * radius * radius * this.height ;
        System.out.println("Volume of cylinder ");
      return v;
    }
}
public class CWH_66_Practise_Ques {
    public static void main(String[] args) {

        Circle ci = new Circle(6);
        Cylinder cr = new Cylinder(4,6);

        System.out.println(ci.area());
        System.out.println(cr.volume());
    }
}
