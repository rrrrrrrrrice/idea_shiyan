package juan_1_4_5;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] employees=new Employee[3];
        employees[0]=new Employee("zhangsan",1200);
        employees[1]=new Employee(200);
        employees[2]=new Employee();
        for (Employee output:employees
             ) {
            System.out.println(Employee.getNextid()+" "+output.getId()+" "+output.getName()+" "+output.getSalary());
        }
        
    }

}
class Employee{
    private static int nextid;
    private int id;
    private String name=" ";
    private int salary;
    static {
        Random generator=new Random();
        nextid=generator.nextInt(1000);
    }
    {
        id=nextid;
        nextid++;
    }
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public Employee(int s){
        this("wangwu",2000);
    }
    public Employee(){
        this("lisi",12000);
    };

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getNextid() {
        return nextid;
    }

    public int getSalary() {
        return salary;
    }
}
