package CWH_64_100_Oops_part2;

class vasu1 extends Thread{
    int x = 0;
    public void run(){
        while (x<400){
        System.out.println("Starting 1st class of Thread");
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        x++;
        }
    }
}

class vasu2 extends Thread{
    int x = 0;
    public void run(){
        while (x<400){
            System.out.println("Starting 2nd class of Thread");
            x++;
        }
    }
}

public class CWH_75_Thread_Methods {
    public static void main(String[] args) {
        vasu1 v1 = new vasu1();
        vasu2 v2 = new vasu2();

        v1.start();

        // join is used so that if we want to set that v1.start should run and when it stops only then v2.start should run
//        v1.join();   // this is showing error

        /* METHOD 1 */

//        try {
//            v1.join();
//        }
//        catch (Exception e )
//        {
//            System.out.println(e);
//        }

        v2.start();

    }
}
