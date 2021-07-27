package wait_notify;

public class Baozi_pu extends Thread{
    //同步技术锁对象 用包子来充当锁对象
    //锁对象要唯一 用包子是因为包子是连接两个的方式?
    private Bao_zi bao_zi=new Bao_zi();

    public Baozi_pu(String name, Bao_zi bao_zi) {
        super(name);
        this.bao_zi = bao_zi;
    }
    //传锁对象和线程名

    public Bao_zi getBao_zi() {
        return bao_zi;
    }

    public void setBao_zi(Bao_zi bao_zi) {

        this.bao_zi = bao_zi;
    }
    //重写run方放启动线程
    //同步技术保证线程唯一
    //while循环一直生产包子

    @Override
    public void run() {
        int count =0;
        //在里面不会共享count

            synchronized (bao_zi)
            {
                if(bao_zi.flag ==true)
                {
                    try {
                        bao_zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //线程被唤醒后执行的代码 说明没有包子
                if(count%2==0)
                {
                    bao_zi.setPi("厚皮");
                    bao_zi.setXian("肉馅");
                }
                else
                {
                    bao_zi.setXian("薄皮");
                    bao_zi.setXian("素馅");
                }
                count++;
                bao_zi.flag=true;
                System.out.println("包子铺正在生产"+bao_zi.getPi()+" "+bao_zi.getXian()+"的包子");
                for (int i = 1; i <=5 ; i++) {
                    System.out.print(i+"秒"+" ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                System.out.println("你可以吃包子了");
                bao_zi.notify();
            }

        }
    }

