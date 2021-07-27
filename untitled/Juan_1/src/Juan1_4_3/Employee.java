package Juan1_4_3;

class Employee{
    private static int nextid=1;
    private int Id;
    private String Name;
    private int Salary;
    public Employee(String Name,int Salary){
        this.Name=Name;
        this.Salary=Salary;
        Id=0;
    }
    public int getId(){
        return Id;
    }
    public void setId(){
        Id=nextid;
        nextid++;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }
    public static int getNextid(){
        return nextid;
    }

    public static void main(String[] args) {
        Employee e=new Employee("zhangsan",1200);
        System.out.println(e.getName()+" "+e.getSalary()+" ");
    }
}