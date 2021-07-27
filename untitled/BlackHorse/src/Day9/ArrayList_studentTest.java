package Day9;

import java.util.ArrayList;

public class ArrayList_studentTest {
    public static void main(String[] args) {
        ArrayList_Student[] students=new ArrayList_Student[5];
        students[0]=new ArrayList_Student("赵丽颖",18);
        students[1]=new ArrayList_Student("杨颖",19);
        students[2]=new ArrayList_Student("黄晓明",20);
        students[3]=new ArrayList_Student("程潇",17);
        students[4]=new ArrayList_Student("李易峰",20);
        ArrayList<ArrayList_Student> performer=new ArrayList<>();
        for (int i=0;i<5;i++){
            performer.add(students[i]);
        }
        for (int j=0;j<5;j++){
          ArrayList_Student s=performer.get(j);
            System.out.println(s.getName()+" "+s.getAge());
        }
        System.out.println(performer);
    }
}
