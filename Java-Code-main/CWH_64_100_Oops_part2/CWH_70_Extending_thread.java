package CWH_64_100_Oops_part2;

// first thread class
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {   // hence we have put it in infinite loop
            System.out.println("My Thread1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

// second thread class
class MyThread2 extends Thread {
    @Override
    public void run() {

        int i = 0;
        while (i <= 10) {   // hence we have put it in infinite loop
            System.out.println("My Thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class CWH_70_Extending_thread {
    public static void main(String[] args) {

        // hence here if we do nnot use threads then it will run line wise and if threads are used then
        // execution comes faster and runs simultaneuosly
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // instead of run we write here start becz it internally call the method extended in threads
        t1.start();
        t2.start();
    }
}
