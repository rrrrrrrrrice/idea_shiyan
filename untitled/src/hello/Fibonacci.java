package hello;

public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int []an=new int[20];
        an[0]=1; an[1]=1;
        System.out.print(an[0]+"  ");
        System.out.print(an[1]+"  ");
        for (i=2;i<an.length;i++){
            an[i]=an[i-2]+an[i-1];
            System.out.print(an[i]+"  ");
        }
        System.out.println();
    }
}
