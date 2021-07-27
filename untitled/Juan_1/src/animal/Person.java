package animal;

import java.util.Objects;

public class Person extends Object {
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

    public Person(String name , int age) {
        this.name=name;
        this.age=age;
    }

    /*@Override
        public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj==this)return true;
        if(obj instanceof Person)
        {
            Person p=(Person)obj;
            boolean t =this.name.equals(p.name) && this.age==p.age;
            //String 类型的equals已经重写了 所以可以直接用
            return t;
        }
        return false;
        //不是person类型 两者类型都不同 直接flase

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//不是这个类的也合并了
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
