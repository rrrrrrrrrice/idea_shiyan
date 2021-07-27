package Subject;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if ((a*a+b*b)>100) System.out.print(a*a+b*b);
        else System.out.print(a+b);
    }
}

