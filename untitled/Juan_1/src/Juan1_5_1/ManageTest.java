package Juan1_5_1;

public class ManageTest {
    public static void main(String[] args) {
        Manager manager=new Manager("zahngsan",1,1200,2015,12,20);
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("lisi",2,1000,2016,12,20);
        staff[1]=new Employee("wangwu",3,900,2017,5,3);
        staff[2]=new Employee("kada",4,800,2019,12,31);
        manager.setBonus(5000);
        System.out.println(manager.getName()+" "+Employee.getNextid()+" "+manager.getId()+" "+manager.getsalary()+" "+manager.getHireDay());
        for (Employee m:staff
             ) {
            System.out.println(m.getName()+" "+Employee.getNextid()+" "+m.getId()+" "+m.getSalary()+" "+m.getHireDay());
        }
        System.out.println();
    }
}
