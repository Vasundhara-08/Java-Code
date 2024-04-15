package CWH_64_100_Oops_part2;

class Thr extends Thread{

    // commonly used constructor of thread are :-
    // Thread() , Thread(String) , Thread(runnable r) , Thread(runnable r,String name)


    public Thr(){
        System.out.println("Constructor with no parameter ");
    }
    public Thr(String name ){
        // means it is calling the constructor from thread class
        super(name);
        System.out.println("Constructor with one parameter ");
    }

    @Override
    public void run() {
        int i =0;
        while (i<5){
            System.out.println("The thread is running ");
            i++;
        }
    }
}
public class CWH_73_Thread_constructor {
    public static void main(String[] args) {
        Thr t1 = new Thr("Vasu");
        Thr t2 = new Thr("Google");
        Thr t3 = new Thr("Important one ");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("The id of thread T1 is " + t1.getId());
        System.out.println("The name of thread T1 is " + t1.getName());
        System.out.println("The id of thread T2 is " + t2.getId());
        System.out.println("The name of thread T2 is " + t2.getName());
        System.out.println("The name of thread 3 is " + t3.getId());
        System.out.println("The name of thread 3 is " + t3.getName());

    }
}
