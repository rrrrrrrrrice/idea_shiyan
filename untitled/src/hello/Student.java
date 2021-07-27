package hello;

public class Student {
    private String name;
    private int xuehao;
    private String sex;
    private int age;
    public Student(){};
    public Student(String name,int xuehao,String sex,int age){
        this.name=name;
        this.xuehao=xuehao;
        this.sex=sex;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student=new Student("陈强",71219327,"男",18);
        System.out.print(student.name+" "+student.xuehao+" "+student.age+" "+student.sex);
        System.out.println();
    }
}









