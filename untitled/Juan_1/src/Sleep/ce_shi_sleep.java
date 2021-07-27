package Sleep;

public class ce_shi_sleep {
    public static void main(String[] args) {
        for (int i = 1; i <=60; i++) {
            System.out.println(i);
            //sleep方法睡眠一秒中
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
