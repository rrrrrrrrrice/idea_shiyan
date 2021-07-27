package shi_yan_6;

public class di_6_4 {
    public static void main(String[] args) {
        int[][] a=new int[4][4];
        int[][] b=new int[4][4];
        int[][] c=new int[4][4];
        int[][] d=new int[4][4];
        int[][] e=new int[4][4];
        int[][] atransposition=new int[4][4];
        int[][] btransposition=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int random=(int)(Math.random()*10);
                a[i][j]=random;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int random=(int)(Math.random()*10);
                b[i][j]=random;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                c[i][j]=a[i][j]+b[i][j];
                d[i][j]=a[i][j]-b[i][j];

            }
        }

          for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int sum=0;
                    for (int m=0;m<4;m++){
                    sum+=a[i][m]*b[m][j];
                    }
                    c[i][j]=sum;
                }
                }
        for (int i=0;i<4;i++)for (int j=0;j<4;j++){
            btransposition[i][j]=a[j][i];

        }
        for (int i=0;i<4;i++)for (int j=0;j<4;j++){
            atransposition[i][j]=a[j][i];

        }
        for (int[] ele:c
             ) {
            for (int ele1:ele
                 ) {
                System.out.print(ele1+" ");

            }
            System.out.println();
        }
        System.out.println("----");
        for (int[] ele2:d
                ) {
            for (int ele3:ele2
                    ) {
                System.out.print(ele3+" ");

            }
            System.out.println();
        }
        System.out.println("----");
        for (int[] ele4:e
                ) {
            for (int ele5:ele4
                    ) {
                System.out.print(ele5+" ");

            }
            System.out.println();
        }
        System.out.println("----");
        for (int[] ele6:atransposition
                ) {
            for (int ele7:ele6
                    ) {
                System.out.print(ele7+" ");

            }
            System.out.println();
        }
        System.out.println("----");
        for (int[] ele8:btransposition
                ) {
            for (int ele9:ele8
                    ) {
                System.out.print(ele9+" ");

            }
            System.out.println();
        }
        System.out.println("----");
        }



    }

