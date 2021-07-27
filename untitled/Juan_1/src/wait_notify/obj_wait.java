package wait_notify;
/*
* 进入到计时等待(TimeWaiting)有两种方式
* 1.sleep(long m) 线程睡醒之后进入Runable/Blocked(运行/堵塞)状态
* 2.object 类的wait(long m) 如果没有notify唤醒
* 时间结束后醒来进入Runable/Blocked(运行/堵塞)状态
* 3.notifyAll()唤醒全部线程 notify()随机唤醒某一个线程
*
* */
public class obj_wait {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread("顾客1")
        {
            @Override
            public void run() {
                synchronized (o) {
                    //保证一个线程执行 你买包子老板不说话
                    System.out.println("顾客一我要吃梅干菜包子");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //告知之后需要等待 进入无线其的等待
                    System.out.println("顾客一开吃！");
                }
            }
        }.start();

        new Thread("顾客2")
        {
            @Override
            public void run() {
                synchronized (o) {
                    //保证一个线程执行 你买包子老板不说话
                    System.out.println("顾客二我要吃梅干菜包子");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //告知之后需要等待 进入无线其的等待
                    System.out.println("顾客二开吃！");
                }
            }
        }.start();

        //创建老板线程
        new Thread("老板")
        {
            @Override
            public void run() {
                /*for (int i = 1; i <=5 ; i++) {
                    System.out.println(i+"秒");*/
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                synchronized (o)
                {
                    System.out.println("你的包子好了");
                    o.notifyAll();
                }
            }
        }.start();

    }
}
