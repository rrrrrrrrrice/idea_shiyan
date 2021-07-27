package hello;

public class Sub extends Super {
    public Sub(String text){
        super(text);
        i=2;
        double pi = Math.PI;
    }

    public static void main(String[] args) {
        Sub sub=new Sub("Hello");
        System.out.println(sub.i);
    }
}
