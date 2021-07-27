package GuessGame;

public class player {
    int num =0;
    public void guessnumber()
    {
        num=(int)(Math.random())*10;
        System.out.println("我猜的数字是:"+num);
    }
}
