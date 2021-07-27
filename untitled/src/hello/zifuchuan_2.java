package hello;

import java.util.*;
public class zifuchuan_2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str0 = sc.nextLine();
        char[] str1 = str0.toCharArray();
        for (int i = 0; i < str0.length(); i++) {
            if(str1[i]=='z')str1[i]='a';
            else if (str1[i]=='Z')str1[i]='A';
            else str1[i]++;
        }
        for (char m:str1){
            System.out.print(m);
        }
        System.out.println();
    }}
