package CWH_64_100_Oops_part2;

class ThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class ThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class CWH_71_Runnable_interface {
    public static void main(String[] args) {
        ThreadRunnable1 bullet1 = new ThreadRunnable1();
        ThreadRunnable2 bullet2 = new ThreadRunnable2();

        // bullet1.start(); // here it is not valid

        // hence for each object we will create a object of thread
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();  // now we can run start
        gun2.start();
    }
}

//  JAVA THREAD LIFE CYCLE

/*  1. NEW :- instance of thread is created after main method before the invocation of start
*   2. RUNNABLE :- After invocation of start and beforw it is selected to be run by scheduler
*   3. RUNNING :- after thread scheduler has selected it
*   4. NON - RUNNABLE :- thread alive , not running (some other thread might be running )
*   5. TERMINATE :- Run() method has exitted   */

