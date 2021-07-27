package shi_yan_4;

import java.util.Scanner;
public class di_4_5 {
    public static void main(String[] args) {
        int z=1,sum=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0){
            z=a%10;
            a=a/10;
            sum+=z;
        }System.out.println(sum);
    }
}

