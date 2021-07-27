package Ticket;

public class zhu_ticket {
    public static void main(String[] args) {
        TicketIml iml = new TicketIml();
        Thread a = new Thread(iml,"窗口一");
        Thread b = new Thread(iml,"窗口二");
        Thread c = new Thread(iml,"窗口三");
        //虽然传入对象相同 但是创建的是不同的线程
        //虽然线程不同 但是指向同一个对象的实现类 ticket是共享的 方法也是共享的
        //线程抢到就会执行run方法 而不是每个线程都有对象的run方法
        a.start();
        b.start();
        c.start();
        //java底层是抢占制CPU 如果没有睡眠 先抢到的线程执行速度快 来不及出现争抢的情况
    }
}
