package shi_yan_4;

public class di_4_4 {
    public static void main(String[] args) {
        double sum=0,t=0,x=1.0,y=2.0;
       while (y!=2020){
         t=x/y;
         sum+=t;
         x++;
         y++;
       }
       System.out.println(sum);
    }
}
