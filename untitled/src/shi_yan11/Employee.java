package shi_yan11;

import java.util.TreeSet;
public class Employee implements Comparable{
    private int id;
    private String name;
    public Employee(int id,String name) {
        this.name=name; this.id=id;
    }
    public int compareTo(Object obj) {
        Employee emp=(Employee)obj;
        return this.id-emp.id;
    }
    public static void main(String[] args) {
        Employee[] myList=new Employee[3];
        myList[0]=new Employee(01,"张三");
        myList[1]=new Employee(02,"李四");
        myList[2]=new Employee(03,"王五");
        TreeSet<Employee> empList=new TreeSet<Employee>();
        empList.add(myList[0]);
        empList.add(myList[1]);
        empList.add(myList[2]);
        for(Employee emp:empList) {
            System.out.println(emp.id+" "+emp.name );
        }
    }
}
