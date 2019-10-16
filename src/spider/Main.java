package spider;

import java.util.concurrent.locks.ReentrantLock;


public class Main {
    public static void main(String[] args)  {
        ReentrantLock locker = new ReentrantLock();
        for(int i = 0; i < 8;i++){
            Thread thread = new Leg("Leg"+ i,locker,i);
            thread.start();
        }
    }

}
