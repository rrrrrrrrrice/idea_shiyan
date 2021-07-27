package wait_notify;

public class chihuo extends Thread{
    //保证锁对象唯一
    private Bao_zi bao_zi=new Bao_zi();

    public chihuo(String name, Bao_zi bao_zi) {
        super(name);
        this.bao_zi = bao_zi;
    }

    public Bao_zi getBao_zi() {
        return bao_zi;
    }

    public void setBao_zi(Bao_zi bao_zi) {
        this.bao_zi = bao_zi;
    }

    @Override
    public void run() {


            synchronized (bao_zi)
            {
                if(bao_zi.flag==false) {
                    try {
                        bao_zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //唤醒后的代码
                System.out.println("我正在吃"+bao_zi.getPi()+" "+bao_zi.getXian()+"的包子");
                for (int i = 1; i <=5 ; i++) {
                    System.out.print(i+"秒"+" ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                bao_zi.flag=false;
                bao_zi.notify();
                System.out.println("我已经吃完"+bao_zi.getPi()+" "+bao_zi.getXian()+"的包子");
            }
        }
    }

