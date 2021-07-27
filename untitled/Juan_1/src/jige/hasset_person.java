package jige;

import animal.Person;

import java.util.HashSet;
import java.util.Set;

public class hasset_person {
    public static void main(String[] args) {
        Set<Person> set =new HashSet<>(); //创建一个hashset的哈希表 存放自定义类型
        Person p1=new Person("杨幂",18);
        Person p2=new Person("jai",18);
        Person p3=new Person("jai",18);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());//hash码是十进制的 逻辑地址
        System.out.println(p3.hashCode());

        //如果不重写 哈希值是不同的 可是
        System.out.println("----------");
        System.out.println(p1);//这是16进制的hash码
        System.out.println(p2==p3);
        System.out.println(p2.equals(p3));
        set.add(p1);
        set.add(p2);
        set.add(p3);


    }
}
