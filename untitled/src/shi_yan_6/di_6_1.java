package shi_yan_6;

import java.util.Arrays;
import java.util.Random ;
public class di_6_1 {
    public static void main(String[] args) {
        Random random=new Random();
        int i,j;
        int []a=new int[]{};
        for (i=0;i<a.length;i++){
           a[i]=random.nextInt();
        }
        for (j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();

    }
}
