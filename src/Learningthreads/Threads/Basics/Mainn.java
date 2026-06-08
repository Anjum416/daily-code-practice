package Learningthreads.Threads.Basics;


public class Mainn {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The Creation of thread");
        MyThread t = new MyThread();
        t.start();
        for (int i = 1; i <= 3; i++) {
            t.join();
            System.out.println(i);

        }
    }
}

