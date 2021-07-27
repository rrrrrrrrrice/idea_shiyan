package nei_bu_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class duo_yi_chang {
    public static void main(String[] args) {
        //int[] age = new int[3];
        int[] age = {1,2,3};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3);
        try {
            int a=age[2];
            int b=list.get(3);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组越界");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("索引越界");
        }
        System.out.println("后续代码");
    }
}
