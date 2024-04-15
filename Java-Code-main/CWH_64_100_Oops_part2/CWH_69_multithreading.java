package CWH_64_100_Oops_part2;

public class CWH_69_multithreading {
    public static void main(String[] args) {
        /* 1. Multithreading involves using multiple threads within a single process to achieve concurrency,
              sharing the same memory space.
           2. Multiprocessing involves using multiple processes to achieve concurrency,each with its
              own memory space.
           3. Multitasking is both multiprocessing and multithreading, allowing multiple tasks to be
              executed concurrently on a computer system  */

        /* A process is an independent and self-contained unit of execution in an operating system.
           Each process has its own memory space, program counter, registers, and system resources.
           Processes are isolated from each other, meaning that one process cannot directly access
           the memory or resources of another process. Processes communicate through inter-process
           communication (IPC) mechanisms, such as pipes, sockets, or shared memory.
         */

        /* A thread is a lightweight unit of execution that exists within a process. Threads within the
           same process share the same memory space, program counter, and resources. Threads are used to
           achieve concurrency within a single process, allowing multiple tasks to be executed concurrently.
           Threads can communicate and share data more easily than processes, but they also introduce
           synchronization challenges due to shared memory. */

        System.out.println("There are two ways for creating a thread :- ");
        System.out.println("1. By extending thread class ");
        System.out.println("2. By implementing runnable interface");

        /* 1. Concurrency is the task of running and managing the multiple computations  at the same time
           2. while parallelism is a task of running multiple computations simultaneously
           3. threads help us to achieve concurrency  */
    }
}
