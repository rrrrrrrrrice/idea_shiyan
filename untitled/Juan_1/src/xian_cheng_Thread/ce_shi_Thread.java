package xian_cheng_Thread;

public class ce_shi_Thread {
    public static void main(String[] args) {
        zi_lei_Tread mytread =new zi_lei_Tread();
        mytread.start();
        for(int i=0;i<20;i++)
        {
            System.out.println("main"+i);
        }
        //多核线程抢夺CPU资源 谁先抢到谁执行

    }

}
