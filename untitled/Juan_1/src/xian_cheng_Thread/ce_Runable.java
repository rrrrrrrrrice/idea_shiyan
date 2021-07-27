package xian_cheng_Thread;

public class ce_Runable {
    public static void main(String[] args) {
        Runableiml runs= new Runableiml();
        //runs.run();没有创建多线程
        Thread thread = new Thread(runs);
        thread.setName("李虎");
        thread.start();
    }
}
