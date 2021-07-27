package xian_cheng_chi;

public class Runableimp implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行任务");
    }
}
