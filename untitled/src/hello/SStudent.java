package hello;

public class SStudent extends Person {
    int xueHao;
    int time;
    String zhuanYe;

    public int getXueHao() {
        return xueHao;
    }

    public int getTime() {
        return time;
    }

    public String getZhuanYe() {
        return zhuanYe;
    }

    public SStudent(int xueHao, int time, String zhuanYe) {
        this.xueHao = xueHao;
        this.time = time;
        this.zhuanYe = zhuanYe;
    }

    public SStudent(String name, int age, String sex) {
        super(name, age, sex);
        System.out.println(getName()+","+getAge()+","+getSex());
    }

    public SStudent() {

    }

    public void setXueHao(int xueHao) {

        this.xueHao = xueHao;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe;
    }

    public static void main(String[] args) {
        Person a=new Person("张三",19,"男") ;
        Teacher b=new Teacher("李四",20,"女") ;
        SStudent c=new SStudent("王五",21,"男");

    }


    }
