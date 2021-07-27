package hello;

import java.util.*;
public class zifuchuan_0 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
    }

}
