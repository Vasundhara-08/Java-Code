package CWH_38_61_Oops_part1;

interface Camera {
    void takeSnap();
    void TakeVideo();
    // an interface can have static an default methods also static method is not associated with
    // object it is associated with class or interface becz we can make reference of interface

    // 1. default method enable us to add new functionaliy to existing interfaces
    // 2. like if you want to update video feature to 4k you cannot deiretly change it
    // void Take4KVideo();  // this will give error
    // 3. So here we use default method :-

    default void Record4Kvideo(){
        System.out.println("Recording in 4kVideo . it is defined in interface ");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetworks(String network);
}

class cellphone {
    void calling(int phoneno) {
        System.out.println("calling from :-" + phoneno);
    }

    void pickCall() {
        System.out.println("Connecting");
    }
}

 class SmartPhone01 extends cellphone implements Wifi, Camera {
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void TakeVideo() {
        System.out.println("Recording Video");
    }


    public void Record4Kvideo() {
        System.out.println("Recording 4k Video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks :-");
        String[] list = {"Vasu", "Sakshi", "Saksham"};
        return list;
    }

    @Override
    public void connectToNetworks(String network) {
        System.out.println("Connected to :- " + network);
    }
}

public class CWH_57_Default_Method_in_interface {
    public static void main(String[] args) {
        SmartPhone01 sp = new SmartPhone01();
        sp.Record4Kvideo();    // here it with 4k method of the class in which it is defined
        String[]  str = sp.getNetworks();
        for(String item :str )
        {
            System.out.println(item);
        }
    }
}
