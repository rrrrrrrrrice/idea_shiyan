package Day9;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张小川");
        list.add("惠子");
        list.add("蔡萝莉");
        list.add("陈强");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
