package animal;

import java.util.ArrayList;

public class person2  {
        public static void main(String[] args) {

            Person a = new Person("地理",75);
            Person b = new Person("地理",75);
            boolean b1 = a.equals(b);
            System.out.println(a);
            System.out.println(b);
            System.out.println(b1);
            //a和b是对象 只写对象其实是对象的地址值 对象的地址值是哈希吗
            ArrayList<String> list =new ArrayList<>();
            //只是用例子说明equal的完整性质 如果不是person类型怎么办

        }
}
