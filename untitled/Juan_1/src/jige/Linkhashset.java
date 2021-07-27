package jige;
//LinkedHashSet 与hashseh区别在于多了一条记录顺序的链表 他是有顺序的
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkhashset {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("www");
        set2.add("abc");
        set2.add("itcast");
        System.out.println(set2);
    }

}
