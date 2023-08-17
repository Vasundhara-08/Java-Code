package CWH_38_50_Oops;

class Vehicles {
    private String model;  // as private variable cannot be accessed by another class
    private int price;

    // To access private variable we create public class and call it here
    public void setmodel(String n){
        model = n ;
    }

    public String getmodel(){
        return model;
    }

    public void setprice ( int m){
       price  = m ;
    }

    public int getprice(){
        return price;
    }

}

public class CWH_40_Private_modifiers {
    public static void main(String[] args) {
        Vehicles vr = new Vehicles();
//        vr.model = "Maruti";
//        vr.price = 200000;     // it throws error becz of private access modifiers

        vr.setmodel("Maruti Suzuki");
        System.out.println(vr.getmodel());
        vr.setprice(290000);
        System.out.println(vr.getprice());

    }
}
