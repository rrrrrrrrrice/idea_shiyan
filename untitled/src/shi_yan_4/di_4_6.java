package shi_yan_4;

public class di_4_6 {
    public static void main(String[] args) {
        int i,j,sum=0;
        for(i=2;i<=2019;i++){
            for(j=2;j<=i&&i%j!=0;j++);
            if(j==i)sum+=i;
            }
        System.out.println(sum);
    }
}
