package nei_bu_class;

import java.util.Scanner;

public class yi_chang_lian_xi {
    static String[] usename ={"张三","李四","王五"};
    //全局数组
    public static void main(String[] args) /*throws RegisterExcertion*/ {
        System.out.println("请输入用户名：");
        Scanner name = new Scanner(System.in);
        String name_s = name.next();
        checkname(name_s);
    }

    public static void checkname (String name_s) /*throws RegisterExcertion*/ {
        for (String name:usename
             ) {
            if(name.equals(name_s)) //是获取的name和name_s比较
            {
                //throw new RegisterExcertion("该用户已经被注册");
                try {
                    throw new RegisterExcertion("该用户已经被注册");
                    //编译期异常 要么throws/try{}catch(){}
                } catch (RegisterExcertion registerExcertion) {
                    registerExcertion.printStackTrace();
                    return; //结束方法
                }
            }
            }
        System.out.println("注册成功");
        }
    }


