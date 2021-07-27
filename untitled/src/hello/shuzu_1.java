package hello;



import java.util.Arrays;
import java.util.Scanner;
public class shuzu_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int []an=new int[5];
        an[0]=sc.nextInt();
        an[1]=sc.nextInt();
        an[2]=sc.nextInt();
        an[3]=sc.nextInt();
        an[4]=sc.nextInt();
        Arrays.sort(an);
        for (int m:an){
            sum+=m;
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.println("数组之和为"+sum);
        System.out.println("最大值为"+an[4]+" "+"最小值为"+an[0]);
        System.out.println("平均值为"+sum/5);

    }
}
