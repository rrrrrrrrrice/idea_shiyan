package shi_yan_3;

import java.util.Scanner;
public class di_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%400==0||a%4==0&&a%100!=0)System.out.printf("%d是闰年\n",a);
        else System.out.printf("%d不是闰年\n",a);

    }
}
