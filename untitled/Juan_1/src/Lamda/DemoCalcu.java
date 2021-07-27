package Lamda;

public class DemoCalcu {
    public static void main(String[] args) {
        cla(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        cla(10, 20,(int a, int b)->{
                return a+b;
        });
        //留下方法的参数 和函数体 接口的匿名内部类的new去掉
    }
    public static void cla(int a,int b,Calculator cl)
    {
        int sum=cl.calc(a,b);
        System.out.println(sum);
    }
}
