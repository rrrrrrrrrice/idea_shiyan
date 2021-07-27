package Subject;
import java.util.*;
public class A_B__1 {
    public static void main(String[] args) {
        int a,b;
        Scanner in =new Scanner(System.in);
        do {
             a=in.nextInt();
             b=in.nextInt();
        }while (a<0||b>10);

        System.out.println(a+b);
    }


}
