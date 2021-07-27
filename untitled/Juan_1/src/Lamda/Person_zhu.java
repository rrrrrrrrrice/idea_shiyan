package Lamda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Person_zhu {
    public static void main(String[] args) {
        Person[] people ={
                new Person("杨幂",20),
                new Person("杨迪",32),
                new Person("王祖蓝",0)
        };
        Arrays.sort(people, (Person o1, Person o2)-> {

                return o1.getAge()-o2.getAge();
            }
        );
        for (Person a:people
             ) {
            System.out.println(a);

        }
    }
}
