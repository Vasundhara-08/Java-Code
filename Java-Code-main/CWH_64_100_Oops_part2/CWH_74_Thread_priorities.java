package CWH_64_100_Oops_part2;

import static java.lang.Thread.sleep;

class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + ": " + i);
                // try-catch block for Thread.sleep() this will help priorities to run properly
                try {
                    sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

public class CWH_74_Thread_priorities {
    public static void main(String[] args) {
            MyThread thread1 = new MyThread();
            MyThread thread2 = new MyThread();

            // Set thread priorities
            thread1.setPriority(Thread.MIN_PRIORITY); // 1 (lowest)
            thread2.setPriority(Thread.MAX_PRIORITY); // 10 (highest)

            thread1.start();
            thread2.start();
        }
    }

