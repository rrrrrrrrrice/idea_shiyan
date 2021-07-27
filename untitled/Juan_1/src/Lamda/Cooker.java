package Lamda;

public class Cooker {
    public static void main(String[] args) {
        make(()->{
            System.out.println("吃饭");
        });
    }
    public static void make(Cook cooker)
    {
        cooker.makefood();
    }

}
