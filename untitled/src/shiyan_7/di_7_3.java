package shiyan_7;

import java.util.*;
public class di_7_3 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str0= sc.nextLine();
        char [] str1=str0.toCharArray();
        char[]str2;
        str2=new char[100];
        int j=0;
        for (int i=0;i<str0.length();i++){
            if(str1[i]!=' '){str2[j]=str1[i];j++;}
        }
        for (int k=0;k<str2.length;k++){
            System.out.print(str2);
        }
        System.out.println();
    }
}

