package jige;

import animal.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortlist_compare {
    public static void main(String[] args) {
        ArrayList<Person> list = new  ArrayList<>();
        Person p1=new Person("迪丽热巴",15);
        Person p2=new Person("古力娜扎",19);
        Person p3=new Person("s但是",18);
        Person p4=new Person("dds是",18);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge();
                if(result==0)
                {
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);

    }
}
