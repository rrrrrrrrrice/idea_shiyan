package jige;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//不准有重复的元素

public class Map {
    public static void main(String[] args) {
        HashMap<Person3,String> map =new HashMap<>();
        Person3 p1=new Person3("张三",14);
        Person3 p2=new Person3("李四",15);
        Person3 p3=new Person3("王五",16);
        Person3 p4=new Person3("王五",16);
        map.put(p1,"a");
        map.put(p2,"b");
        map.put(p3,"c");
        map.put(p4,"d");
        System.out.println(map);
        System.out.println("----------");
        Set<Person3> k = map.keySet();//因为只是的单个元素 就划为set集合了 将k值全部放入set集合
        Iterator<Person3> it = k.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("--------");
        Set<java.util.Map.Entry<Person3, String>> entry = map.entrySet();
        for (java.util.Map.Entry<Person3, String> entr:
                entry
             ) {
            System.out.println(entr.getKey()+"         "+entr.getValue());
        }
    }
}
