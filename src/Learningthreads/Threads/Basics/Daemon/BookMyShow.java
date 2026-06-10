package Learningthreads.Threads.Basics.Daemon;
class Book{
    int seat=2;
    public void booking(String name){
        if(seat>=1){
            System.out.println("the seat is booked for "+name);
            seat--;
        }
        else{
            System.out.println("No seats Available");
        }
    }
}
public class BookMyShow {
    public static void main(String args[])throws InterruptedException{
        Book b=new Book();
        Thread t1=new Thread(()->
        {
            b.booking("anjum");
        });
        Thread t2=new Thread(()->
        {
            b.booking("AAA");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Done");
    }
}
