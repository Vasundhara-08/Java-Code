package CWH_64_100_Oops_part2;

       // Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen
class Thread1 extends Thread {
    public void run() {

        // Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
//        try {
//            Thread.sleep(200);
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        int f = 0;
        while (f<100) {
            System.out.println("Welcome");
            f++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {

        int f=0;
        while (f<100) {
            System.out.println("Good morning");
            f++;
        }
    }
}

public class CWH_76_Practise_Ques {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
//        t1.start();
//        t2.start();

        // Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.

//        t1.setPriority(5);
//        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        // Question 4: How do you get the state of a given thread in Java?
//        System.out.println(t1.getState());
//         t2.start();
//        System.out.println(t2.getState());

        // Question 5: How do you get the reference to the current thread in Java?
        System.out.println(Thread.currentThread().getState());
    }

}
