package Juan1_5_1;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private String name;
    private static int nextid;
    private int id;
    private int salary;
    private LocalDate hireDay;
    public Employee(String name,int id,int salary,int year,int month,int day){
        this.name=name;
        this.id=id;
        this.salary=salary;
        hireDay=LocalDate.of(2019,12,23);
    }
   static {
       Random in=new Random();
       nextid=in.nextInt(100);
   }
   public static int getNextid(){
        return nextid;
   }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}
