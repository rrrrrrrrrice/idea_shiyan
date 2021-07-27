package Juan1_5_1;

import java.time.LocalDate;

public class Manager extends Employee {
    private int bonus;
    public Manager(String name,int id,int salary,int year,int month,int day){
        super("zahngsan",12,1200,2015,12,3);
        bonus=0;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getsalary(){
        int basesalary=super.getSalary();
        return bonus+basesalary;
    }
}
