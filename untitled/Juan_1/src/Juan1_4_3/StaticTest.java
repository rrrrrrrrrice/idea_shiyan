package Juan1_4_3;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("zahng",120);
        staff[1]=new Employee("sags",12000);
        staff[2]=new Employee("sichuan",3200);
        for (Employee e:staff
             ) {
            System.out.println(e.getName()+" "+Employee.getNextid()+" "+e.getId()+e.getSalary()+" ");
        }

    }
}
