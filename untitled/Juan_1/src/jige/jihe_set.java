package jige;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1.不准有重复的元素 2.由于底层是哈希表 所以是一个无序的集合
//没有索引 所以不能用普通for循环
public class jihe_set  {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())//返回下一个迭代器是否存在
        {
            Integer a = it.next();
            System.out.println(a);
        }
        for(int b:set)
        {
            System.out.println(b);
        }


    }

}
