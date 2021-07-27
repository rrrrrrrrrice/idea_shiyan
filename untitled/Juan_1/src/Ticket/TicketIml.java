package Ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketIml implements Runnable{
    Lock l =new ReentrantLock();

   private int ticket = 10;
   Object obj=new Object();
    @Override
    public void run() {

        while (true)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步中的线程没有执行完毕不会释放锁对象 线程没有锁对象无法进入同步代码块
            //出了同步就会把锁对象归还
            l.lock();
                if(ticket>0)
                {
                    System.out.println(Thread.currentThread().getName()+"正在售卖---->"+ ticket);
                    ticket--;
                }
            l.unlock();
        }
    }
}
