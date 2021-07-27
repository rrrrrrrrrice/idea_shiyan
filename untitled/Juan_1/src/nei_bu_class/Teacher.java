package nei_bu_class;

public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void ji()
    {
        System.out.println("sssss");
    }

    public class student{
        private String name_s;
        private int age_s;
        public void st()
        {
            System.out.println("我是学生");
        }

    }
}
