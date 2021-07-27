package shi_yan_6;
import java.util.Arrays;
public class di_6_3 {
    public static void main(String[] args) {
        int[] arr=new int[50];
        int p=0;
        for (int i=0;i<50;i++){
            int random=(int)(Math.random()*10);
            arr[i]=random;
        }
        Arrays.sort(arr);
        for (int ele:arr
             ) {
            System.out.print(ele);
            if(++p%5==0) System.out.println();
        }
    }
}
