package xian_cheng_Thread;

public class Mythread extends zi_lei_Tread {
    public static void main(String[] args) {
        Thread mt=new zi_lei_Tread();
        mt.setName("王国章");
        mt.start();//调用run方法
        new zi_lei_Tread2().start();

        /*System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
        new zi_lei_Tread("旺财").start();*/


    }
}
