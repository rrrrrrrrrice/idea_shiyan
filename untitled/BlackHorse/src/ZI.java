import java.util.Scanner;

 class ZI {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int score=in.nextInt();
        if (score>=90) System.out.print("Excellent");
        else if (score>=80) System.out.print("Good");
        else if (score>=60) System.out.print("Pass");
        else System.out.print("Fail");
    }
}
