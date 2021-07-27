package jige;
//可变参数就是自定义参数 底层是数组
// 注意他的数据类型要确定 一个参数列表值只能有一个可变参数
//如果有多个可变参数 他只能放在最后
public class kebian_canhsu {
    public static int add(int ...arr)
    {
        int sum=0;
        for (int a:arr)
        {
            sum+=a;
        }
        return sum;
    };
    public static int app(int a,int ...arr)
    {
        return 0;
    }


    public static void main(String[] args) {
        int reult = add(1, 2, 3);
        System.out.println(reult);


    }
}
