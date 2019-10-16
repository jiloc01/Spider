package spider;

import java.util.concurrent.locks.ReentrantLock;

public class Leg extends Thread{
    ReentrantLock locer;
    private String name;
    private static volatile int queue = 0;
    private int num;
    private int counter = 0;
    private static int countLeg = 0;

    Leg(String name, ReentrantLock lock, int num){
        this.name=name;
        locer = lock;
        this.num = num;
        countLeg++;
    }
    public void move(){
        System.out.println("leg "+name+" move");
    }

    public void run() {
        while (counter < 8) {

            {
                if (queue == num) {
                    //locer.lock();
                    move();
                    queue = (queue + 1) % countLeg;
                    counter++;
                    //locer.unlock();
                }

            }

        }
    }

}
