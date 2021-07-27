package hello;

public class qiuhe {
    public static void main(String[] args) {

       int chu=sum();
        System.out.println(chu);
    }
    public static int sum(){
        int i,t=0;
        for (i=1;i<=100;i++){
            t+=i;
        }
        return t;
    }
}
