package wait_notify;

import java.util.concurrent.locks.Lock;

public class wait_notify {
    public static void main(String[] args) {
        //创建锁对象
        Object o = new Object();
        //创建顾客线程
        new Thread("顾客")
        {
            @Override
            public void run() {
                synchronized (o) {
                    //保证一个线程执行 你买包子老板不说话
                    System.out.println("我要吃梅干菜包子");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //告知之后需要等待 进入无线其的等待
                }
            }
        }.start();

        //创建老板线程
        new Thread("老板")
        {
            @Override
            public void run() {
                for (int i = 1; i <=5 ; i++) {
                        System.out.println(i+"秒");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (o)
                {
                    System.out.println("你的包子好了");
                    o.notify();
                }
            }
        }.start();



    }
}

