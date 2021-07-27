package shi_yan_8;



public class Person {
     String name;
     String sex;
     int age;

    public Person(int i, String 男, int age){};
    public Person(String name,String sex,int age){
        this.name=name; this.sex=sex; this.age=age;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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






    class Teacher extends Person{
        String jobTitile;
        String dept;

        public Teacher(String jobTitile,String dept){
             super ("陈强","男",18);
            this.jobTitile=jobTitile;
            this.dept=dept;
        };


        public String getJobTitile() {
            return jobTitile;
        }

        public void setJobTitile(String jobTitile) {
            this.jobTitile = jobTitile;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }
    };


    class Student extends Teacher{
        int xuehao,time;
        String major;


        public Student(){
            super("数学老师","数学");
            System.out.println(jobTitile+" "+" "+dept);
        }

        public int getXuehao() {
            return xuehao;
        }

        public void setXuehao(int xuehao) {
            this.xuehao = xuehao;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }
    }



}
