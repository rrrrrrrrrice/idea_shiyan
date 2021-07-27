package shi_yan11;

import java.util.Arrays;
import java.util.*;
public class JLab11Pro4 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();
        s.add("abcdef");
        s.add("ghijk");
        s.add("LMNOP");
        s.add("qrstu");
        s.add("vwxyz");
        System.out.println("原列表是：");
        for(String w:s)
        {
            System.out.print(w+"  ");
        }
        System.out.println();
        System.out.println("通过索引循环访问使得每个字符串转换成大写：");
        for(String i:s)
        {
            System.out.print(i.toUpperCase()+"  ");
        }
        System.out.println();
        System.out.println("使用迭代器使得每个字符串转换成大写：");
        Iterator x=s.iterator();//生成一个迭代器，并赋值给x
        while (x.hasNext()) {//使用hasNext()检查序列中是否还有元素
            String m =(String) x.next();
            m=m.toUpperCase();
            System.out.print(m+"  ");
        }
        System.out.println();
        System.out.println("调用replaceAll()方法使得每个字符串转换成大写：");
        s.replaceAll(m->m.toUpperCase());
        for(String k:s)
        {
            System.out.print(k+" ");
        }
    }
}
