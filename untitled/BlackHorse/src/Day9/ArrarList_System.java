package Day9;

import java.util.ArrayList;

public class ArrarList_System {
    public static void main(String[] args) {
        ArrayList_Student[] student=new ArrayList_Student[4];
        student[0]=new ArrayList_Student("赵丽颖",12);
        student[1]=new ArrayList_Student("张翰",13);
        student[2]=new ArrayList_Student("郑爽",14);
        student[3]=new ArrayList_Student("唐嫣",25);
        ArrayList<ArrayList_Student> performer=new ArrayList<>();
       for (int j=0;j<4;j++){
           performer.add(student[j]);
       }
        System.out.print("{");
        for (int i=0;i<4;i++){
            ArrayList_Student s=performer.get(i);
            System.out.print(s.getName()+" "+s.getAge()+"  ");
        }
        System.out.print("}");
    }

}
