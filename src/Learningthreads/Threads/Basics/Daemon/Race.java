package Learningthreads.Threads.Basics.Daemon;
class MyRacee{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class Race {
    public static void main(String[] args)throws InterruptedException{
        MyRacee r=new MyRacee();
        Thread t1= new Thread(()->
        {
            for(int i=1;i<=1000;i++){
                r.increment();
            }
        });
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=1000;i++){
                r.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.count);
    }
}
