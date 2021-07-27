package jige;

import java.util.Map;
//Map 底层是哈希表
public class HashMap {
    public static void test02()
    {
        Map<String,Integer> test2 =new java.util.HashMap<>();
        test2.put("历程",1);
        test2.put("渐变",1);
        System.out.println(test2);
        System.out.println(test2.remove("历程"));//返回的是v的值
        System.out.println(test2.remove("但是"));//返回的是v的值
        System.out.println(test2);
    }
    public static void test03()
    {
        Map<String,Integer> test3 =new java.util.HashMap<>();
        test3.put("王国章",1);
        test3.put("傻二狗",22);
        System.out.println(test3);
        System.out.println(test3.get("王国章"));//返回的是v的值
        System.out.println(test3.get("sd"));//返回的是v的值
        System.out.println(test3);
    }
    public static void main(String[] args) {

        Map<String,String> map =new java.util.HashMap<>();
        //创建HashMap集合
        map.put("历程","丰碑");
        map.put("渐变","傻屌");
        System.out.println(map);
        //没有打印哈希地址 说明他重写了toString方法
        System.out.println("--------------+");
        test02();
        System.out.println("*********************");
        test03();
    }
}
