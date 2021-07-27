package nei_bu_class;

public class bao_zhuang_class {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        System.out.println(a);
        //重写了tostring方法
        System.out.println(a.intValue());
        //System.out.println(a.equals(10));
        int i = a.intValue();
        System.out.println(i);
    }
}
