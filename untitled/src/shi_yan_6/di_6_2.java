package shi_yan_6;
import java.util.*;
public class di_6_2 {
    public static void main(String[] args) {
        int[][] a = new int[4][5];

        int p = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int random = (int) (Math.random() * 10);
                a[i][j] = random;
            }

        }
        System.out.println(Arrays.deepToString(a));
        for (int[] row : a
                ) {
            for (int value : row
                    ) {
                System.out.print(value);

                if (++p % 4 == 0) System.out.println();

            }

        }
    }
}