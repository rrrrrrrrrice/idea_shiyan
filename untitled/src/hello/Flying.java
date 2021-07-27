package hello;

import java.util.Scanner;
import java.math.*;
public class Flying {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int random=(int)((Math.random()*10)+1);
            a[i]=random;

        }
        for (int shu:a
             ) {
            System.out.print(shu+" ");

        }
        System.out.println();
    }

}