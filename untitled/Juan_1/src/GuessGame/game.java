package GuessGame;

public class game {
    player p1=new player();
    player p2=new player();
    player p3=new player();
    public void stargame()
    {
        int cunnum1 = 0;
        int cunnum2 = 0;
        int cunnum3 = 0;
        //保存自己猜的数
        boolean p1right1=false;
        boolean p2right2=false;
        boolean p3right3=false;
        //保存是否猜正确
        //生成猜测的数字
        int guessnum=(int)(Math.random()*10);
        System.out.println("需要猜中的数字是"+guessnum);
        //生成他们猜的数字
        cunnum1=p1.num;
        cunnum2=p2.num;
        cunnum3=p3.num;
        //判断是否正确
        if(cunnum1==guessnum)
        {
            p1right1 = true;
            System.out.println("我是p1,我的数字是" + cunnum1 + " 我猜对了");
        }
        if(cunnum2==guessnum)
        {
            p2right2 = true;
            System.out.println("我是p2,我的数字是" + cunnum2 + " 我猜对了");
        }
        if(cunnum3==guessnum)
        {
            p3right3 = true;
            System.out.println("我是p3,我的数字是" + cunnum3 + " 我猜对了");
        }
        if(( p1right1 || p2right2 || p3right3 )==false)
        {
            System.out.println("没一个猜中");

        }
    }
}
