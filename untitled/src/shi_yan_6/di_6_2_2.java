package shi_yan_6;

import java.util.Arrays;

public class di_6_2_2 {
    public static void main(String[] args) {
        int[][] b=new int[4][];
        for (int s=0;s<4;s++)b[s]=new int[s+3];

        for (int d=0;d<4;d++){
            for (int f=0;f<b[d].length;f++){
                int randon2=(int)(Math.random()*10);
                b[d][f]=randon2;
            }
        }
        System.out.println(Arrays.deepToString(b));
        for (int i=0;i<4;i++){
            for (int j=0;j<b[i].length;j++){

                System.out.print(b[i][j]);
                }
            System.out.println();
        }

    }
    }

