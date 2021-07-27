package shi_yan_4;


import java.util.Scanner;
public class di_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0&&a<=20)System.out.println('E');
        else if(a>20&&a<=40)System.out.println('D');
        else if(a>40&&a<=60)System.out.println('C');
        else if(a>60&&a<=80)System.out.println('B');
        else System.out.println('A');

    }
}
