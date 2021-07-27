package wait_notify;

public class zhu_baozi {

    public static void main(String[] args) {
        Bao_zi bao_zi=new Bao_zi();
        Baozi_pu baozi_pu = new Baozi_pu("包子铺",bao_zi);
        chihuo chihuo = new chihuo("消费者", bao_zi);
        //指向同一个对象 都是包子对象 这样就保证锁对象唯一 但是为啥在自己里面还要声明包子对象
        chihuo.start();baozi_pu.start();



    }
}
