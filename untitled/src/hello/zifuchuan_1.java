package hello;

import java.util.*;
public class zifuchuan_1 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        String str0 = sc.nextLine();
        String str1= sc.nextLine();
        if(str0.indexOf(str1)!=-1)
        System.out.println("第二个是第一个的子串");
        else System.out.println("第二个不是第一个的子串");

    }
}
