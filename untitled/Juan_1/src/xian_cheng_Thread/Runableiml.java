package xian_cheng_Thread;

public class Runableiml implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            //sleep方法睡眠一秒中
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
