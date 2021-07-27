package jige;
import java.util.HashMap;
import java.util.Scanner;

public class ji_suan_char {
    public static void main(String[] args) {
        //创建字符串对象

        /*Scanner sc = new Scanner(System.in);
        String str=sc.next();*/
        String str="asad";

        //创建map集合 k是字符 v是值 k不重复 v可以重复 
        //k存一次就好了 再用contain方法来判断是否有这个字符 如果没有就放入k中
        HashMap<Character,Integer> map =new HashMap<>();
        
        //获取字符
        for (char c: str.toCharArray()
             ) {

            //存在 v++ 因为是每个字符(a b..)是一一对应的 所以v值也是一一对应的
            if(map.containsKey(c))
            {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
                //获取之后我们需要put进去 看起来不会改
            }
            else
            {
                map.put(c,1);
            }
        }

        System.out.println(map);
    }
}
