package xian_cheng_Thread;

public class zi_lei_Tread extends Thread{
    public zi_lei_Tread() {
    }

    public zi_lei_Tread(String name) {
        super(name);
    }

    @Override
    public void run() {
       /*1.继承子类
       2.重写方法
       3.设置线程任务*/
       /*for(int i=0;i<20;i++)
       {
           System.out.println("run"+i);
       }*/
        String name = getName();
        System.out.println(name);
        Thread th = Thread.currentThread();
        System.out.println(th);



    }
}
