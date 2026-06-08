package Learningthreads.Threads.Basics;


public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <=3; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(i+"iam new Thread");
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
