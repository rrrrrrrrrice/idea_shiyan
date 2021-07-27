package hello;

public class Teacher extends Person {
    String jobTitile;
    String dept;

    public Teacher() {
    }

    public Teacher(String jobTitile, String dept) {
        this.jobTitile = jobTitile;
        this.dept = dept;
    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
        System.out.println(getName()+","+getAge()+","+getSex());
    }

    public Teacher(String name, int age, String sex, String jobTitile) {
        super(name, age, sex);
        this.jobTitile = jobTitile;
    }

    public void setJobTitile(String jobTitile) {

        this.jobTitile = jobTitile;

    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJobTitile() {
        return jobTitile;
    }

    public String getDept() {
        return dept;
    }
}


