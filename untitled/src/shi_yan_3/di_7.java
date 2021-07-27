package shi_yan_3;

import java.util.Scanner;
public class di_7 {
    public static void main(String[] args) {
        int t=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){t=a;a=b;b=t;}
        if(a<c){t=a;a=c;c=t;}
        if(b<c){t=b;b=c;c=t;}
        System.out.printf("%d %d %d\n",a,b,c);

    }
}
