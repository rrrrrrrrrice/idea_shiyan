package Day9;

import java.util.ArrayList;
import java.util.Random;

public class ArrarListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> in=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<6;i++){
           int r= random.nextInt(33)+1;
            in.add(r);
        }
        for (Integer m:in
             ) {
            System.out.println(m);

        }
    }
}
